package Test;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Test{ 
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9090);
        OutputStreamWriter outputStream = new OutputStreamWriter(socket
                .getOutputStream());
        BufferedReader input = new BufferedReader(new InputStreamReader
                (System.in));
        BufferedReader informBack = new BufferedReader(new InputStreamReader
                (socket.getInputStream()));
        String line;
        while ((line=input.readLine())!=null){
            outputStream.write(line+"\n");
            outputStream.flush();
            if (line.equals("exit")){
                break;
            }
            System.out.println(informBack.readLine());
        }
        socket.close();
    }

}

