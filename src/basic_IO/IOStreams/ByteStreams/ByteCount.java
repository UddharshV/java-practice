package basic_IO.IOStreams.ByteStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteCount {
    public static void main(String[] args)throws IOException {

        FileInputStream in = null;

        try{
            in = new FileInputStream("./basic_IO/IOStreams/ByteStreams/input/test.txt");

            int count = 0;

            while(in.read() != -1)
                count++;

            System.out.println("Total bytes: " + count);
        }
        finally{
            if(in != null)
                in.close();
        }
    }
}
