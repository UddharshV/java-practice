package practice_pack.patterns;

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
                *
               * *
              * * *
             * * * *
            * * * * *
             * * * *
              * * *
               * *
                *
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
