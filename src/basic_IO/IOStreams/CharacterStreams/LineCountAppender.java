package basic_IO.IOStreams.CharacterStreams;

import java.io.*;

public class LineCountAppender {
    public static void main(String[] args)throws IOException {

        BufferedReader ipStream = null;
        PrintWriter opStream = null;

        try{
            ipStream = new BufferedReader(new FileReader("./basic_IO/IOStreams/CharacterStreams/input/test_04.txt"));
            opStream = new PrintWriter(new FileWriter("./basic_IO/IOStreams/CharacterStreams/output/test_04_op.txt"));

            String inpLine;
            int lineCount = 1;

            while((inpLine = ipStream.readLine()) != null){
                opStream.println(lineCount + ". " + inpLine);
                lineCount++;
            }

            System.out.println("Task finished... Number of lines in given input text file: " + (lineCount-1));
        }
        finally{
            if(ipStream != null)
                ipStream.close();
            if(opStream != null)
                opStream.close();
        }

    }
}
