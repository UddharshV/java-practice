package basic_IO.IOStreams.CharacterStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class ModifiedCopyCharacterForLineIO {
    public static void main(String[] args)throws IOException {

        BufferedReader ipStream = null;
        PrintWriter opStream = null;

        try{
            ipStream = new BufferedReader(new FileReader("./basic_IO/IOStreams/CharacterStreams/input/test_02.txt"));
            opStream = new PrintWriter(new FileWriter("./basic_IO/IOStreams/CharacterStreams/output/test_02_op.txt"));

            String inpLine;

            while((inpLine = ipStream.readLine()) != null)
                opStream.println(inpLine);
        }
        finally{
            if(ipStream != null)
                ipStream.close();
            if(opStream != null)
                opStream.close();
        }

    }
}
