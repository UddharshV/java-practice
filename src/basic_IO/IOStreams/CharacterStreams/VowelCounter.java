package basic_IO.IOStreams.CharacterStreams;

import java.io.FileReader;
import java.io.IOException;

public class VowelCounter {
    public static void main(String[] args)throws IOException {

        FileReader ipStream = null;

        try{

            ipStream = new FileReader("./basic_IO/IOStreams/CharacterStreams/input/test_03.txt");
            int character;
            int count = 0;
            String vowels = "aeiouAEIOU";
            while((character = ipStream.read()) != -1){
                /*
                  if((char)character == 'A' || (char)character == 'E' || (char)character == 'I' || (char)character == 'O' || (char)character == 'U' || (char)character == 'a' || (char)character == 'e' || (char)character == 'i' || (char)character == 'o' || (char)character == 'u')
                  count++;
                 */
                if(vowels.indexOf(character) != -1)
                    count++;
            }


            System.out.println("Vowel count in input text: " + count);
        }
        finally {
            if(ipStream != null)
                ipStream.close();
        }

    }
}
