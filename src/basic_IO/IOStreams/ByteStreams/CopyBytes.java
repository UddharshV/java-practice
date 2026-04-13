package basic_IO.IOStreams.ByteStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException{

        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            System.out.println(System.getProperty("user.dir"));
            in = new FileInputStream("./basic_IO/IOStreams/ByteStreams/input/test.txt");
            out = new FileOutputStream("./basic_IO/IOStreams/ByteStreams/output/test_op.txt");

            int characters;

            while((characters = in.read()) != -1){
                out.write(characters);
            }

        }
        finally{

            if(in != null)
                in.close();

            if(out != null)
                out.close();

        }
    }
}
