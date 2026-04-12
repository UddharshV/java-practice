package practice_pack.patterns;

import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            E D C B A
            D C B A
            C B A
            B A
            A
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        int num = 65;
        for(int i=n-1;i>=0;i--){
           for(int j=i; j>=0;j--){
               System.out.print((char)(num+j) + " ");
           }
            System.out.println();
        }
    }
}
