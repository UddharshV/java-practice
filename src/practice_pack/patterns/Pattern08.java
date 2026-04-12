package practice_pack.patterns;

import java.util.Scanner;

public class Pattern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
           *
          ***
         *****
        *******
       **********
           *
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<2*i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
