package basic_IO.IOStreams.ScanningFormatting;

import java.io.*;
import java.util.Scanner;
import java.util.Locale;

public class ScanSum {
    public static void main(String[] args)throws IOException {
        Scanner sc = null;
        double sum = 0;

        try{
            sc = new Scanner(new BufferedReader(new FileReader("./basic_IO/IOStreams/ScanningFormatting/input/usnumbers.txt")));
            sc.useLocale(Locale.US);

            while(sc.hasNext()){
                if(sc.hasNextDouble())
                    sum += sc.nextDouble();
                else
                    sc.next();
            }
        }
        finally{
            if(sc != null)
                sc.close();
        }
        System.out.println(sum);
    }
}
