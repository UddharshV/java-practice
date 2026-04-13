package basic_IO.IOStreams.ByteStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConvertCaseCopy {

    public static void main(String[] args)throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("./basic_IO/IOStreams/ByteStreams/input/test_03.txt");
            out = new FileOutputStream("./basic_IO/IOStreams/ByteStreams/output/test_converted_case.txt");
            int byteVal;

            while((byteVal = in.read()) != -1){

                if(byteVal >=97 && byteVal <=122)
                    byteVal -= 32;

                if(byteVal >=65 && byteVal <=90)
                    byteVal +=32;


                out.write(byteVal);

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
