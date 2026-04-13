package basic_IO.IOStreams.ByteStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteInspector {
    public static void main(String[] args)throws IOException {

        FileInputStream in = null;

        try{
            in = new FileInputStream("./basic_IO/IOStreams/ByteStreams/input/test_02.txt");
            int byteVal;
            int pos = 0;
            char ch;

            while((byteVal = in.read()) != -1){
                ch = (char)byteVal;
                System.out.println("Input Character: " + ch + " --> Position: " + pos + " -> byte value: " + byteVal);
                pos++;
            }
        }
        finally{
            if(in != null)
                in.close();
        }
    }
}
