package 加密;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by XiaochengWen on 4/1/16.
 */
public class 加密 {

    public static void main(String[] args) throws Exception {
        // write your code here
        int index;
        File inFile = new File("/Users/XiaochengWen/Documents/programmer/JAVA 2015基础班33期/day04/jiami.png");
        File outFile = new File("/Users/XiaochengWen/Documents/programmer/JAVA 2015基础班33期/day04/jiemi.png");
        FileInputStream input = new FileInputStream(inFile);
        FileOutputStream output = new FileOutputStream(outFile);
        while ((index = input.read()) != -1)
        {
            output.write(index^10);
        }

        output.close();
        input.close();
    }
}
