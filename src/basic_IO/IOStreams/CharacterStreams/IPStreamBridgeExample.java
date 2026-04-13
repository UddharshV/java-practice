package basic_IO.IOStreams.CharacterStreams;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class IPStreamBridgeExample {
    public static void main(String[] args)throws IOException {

        BufferedReader ipStream = null;
        PrintWriter opStream = null;

        try{
            ipStream = new BufferedReader(new InputStreamReader(System.in));
            opStream = new PrintWriter(new FileWriter("./basic_IO/IOStreams/CharacterStreams/output/test_05_op.txt"));

            System.out.println("Enter your input below: Type 'exit' to stop...");

            String ipLine;

            while((ipLine = ipStream.readLine()) != null){
                if(ipLine.equals("exit"))
                    break;
                opStream.println(ipLine);
            }

            System.out.println("Task finished... Input saved to file.");
        }
        finally{
            if(ipStream != null)
                ipStream.close();
            if(opStream != null)
                opStream.close();
        }

    }
}
