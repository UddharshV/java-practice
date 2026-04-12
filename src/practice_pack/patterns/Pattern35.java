package practice_pack.patterns;

import java.util.Scanner;

public class Pattern35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            1      1
            12    21
            123  321
            12344321
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print(j);
            for(int j=1; j<2*(n-i); j++)
                System.out.print(" ");
            for(int j=i; j>=1; j--)
                System.out.print(j);
            System.out.println();
        }
    }
}
