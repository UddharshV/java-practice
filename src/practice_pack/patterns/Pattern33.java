package practice_pack.patterns;

import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            a
            B c
            D e F
            g H i J
            k L m N o
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        int ch1 = 97, ch2 = 65;
        boolean flag = true;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(flag)
                    System.out.print((char)ch1 + " ");
                else
                    System.out.print((char)ch2 + " ");
                ch1++;
                ch2++;
                flag = !flag;
            }
            System.out.println();
        }

    }
}
