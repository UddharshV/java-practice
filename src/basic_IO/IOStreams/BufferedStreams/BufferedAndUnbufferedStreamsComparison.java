package basic_IO.IOStreams.BufferedStreams;

import java.io.*;

public class BufferedAndUnbufferedStreamsComparison {
    public static void main(String[] args)throws IOException {

        FileReader ipStream1 = null;

        BufferedReader ipStream2 = null;

        try{
            ipStream1 = new FileReader("./basic_IO/IOStreams/BufferedStreams/input/test_01.txt");
            ipStream2 = new BufferedReader(new FileReader("./basic_IO/IOStreams/BufferedStreams/input/test_01.txt"));

            long start, timeTaken;
            int count1 = 0, count2 = 0;


            //Task 1 - Unbuffered Stream Read
            start = System.currentTimeMillis();
            System.out.println("System's current time (ms): " + start);

            while((ipStream1.read()) != -1)
                count1++;

            timeTaken = System.currentTimeMillis() - start;
            System.out.println("Time taken to complete task 1: " + timeTaken);

            System.out.println();

            //Task 2 - Buffered Stream Read
            start = System.currentTimeMillis();
            System.out.println("System's current time (ms): " + start);

            while((ipStream2.read()) != -1)
                count2++;

            timeTaken = System.currentTimeMillis() - start;
            System.out.println("Time taken to complete task 2: " + timeTaken);


            System.out.println("Number of characters in input file as per Input Stream 01: " + count1);
            System.out.println("Number of characters in input file as per Input Stream 02: " + count2);
        }
        finally{
            if(ipStream1 != null)
                ipStream1.close();
            if(ipStream2 != null)
                ipStream2.close();
        }


    }
}
