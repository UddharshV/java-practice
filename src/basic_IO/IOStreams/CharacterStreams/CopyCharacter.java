package basic_IO.IOStreams.CharacterStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacter {
    public static void main(String[] args)throws IOException {

        FileReader ipStream = null;
        FileWriter opStream = null;

        try{
            ipStream = new FileReader("./basic_IO/IOStreams/CharacterStreams/input/test_01.txt");
            opStream = new FileWriter("./basic_IO/IOStreams/CharacterStreams/output/test_01_op.txt");

            int character;

            while((character = ipStream.read()) != -1)
                opStream.write(character);
        }
        finally{
            if(ipStream != null)
                ipStream.close();
            if(opStream != null)
                opStream.close();
        }

    }
}
