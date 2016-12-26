package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by XiaochengWen on 2016/12/23.
 */
public class Testreceive {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9090);
        Socket socket = serverSocket.accept();
        BufferedReader inputStream = new BufferedReader(new InputStreamReader
                (socket.getInputStream()));
        OutputStreamWriter outputStream = new OutputStreamWriter(socket
                .getOutputStream());
        BufferedReader input = new BufferedReader(new InputStreamReader
                (System.in));
        String s;
        while ((s = inputStream.readLine())!=null){
            System.out.println(s);
            outputStream.write(input.readLine()+"\n");
            outputStream.flush();
            if (s.equals("exit")){
                break;
            }
        }
        serverSocket.close();
    }

}
