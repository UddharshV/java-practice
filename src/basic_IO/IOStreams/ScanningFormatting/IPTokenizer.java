package basic_IO.IOStreams.ScanningFormatting;

import java.io.*;
import java.util.Scanner;

public class IPTokenizer {
    public static void main(String[] args)throws IOException {
        Scanner sc = null;

        try{
            sc = new Scanner(new BufferedReader(new FileReader("./basic_IO/IOStreams/ScanningFormatting/input/test_01.txt")));

            while(sc.hasNext())
                System.out.println(sc.next());
        }
        finally{
            if(sc != null)
                sc.close();
        }
    }
}
