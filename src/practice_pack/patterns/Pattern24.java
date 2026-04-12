package practice_pack.patterns;

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
             *        *
             **      **
             * *    * *
             *  *  *  *
             *   **   *
             *   **   *
             *  *  *  *
             * *    * *
             **      **
             *        *
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        for(int i=1; i<=n; i++){
            if(i==1)
                for(int j=1; j<=2*n; j++)
                    if(j==1 || j==2*n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            else
                for(int j=1; j<=2*n; j++)
                    if(j==1 || j==2*n)
                        System.out.print("*");
                    else if(j==i || j==2*n-i+1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            if (i == 2 * n)
                for (int j = 1; j <= 2 * n; j++)
                    if (j == 1 || j == 2 * n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            else
                for (int j = 1; j <= 2 * n; j++)
                    if (j == 1 || j == 2 * n)
                        System.out.print("*");
                    else if (j == i || j == 2 * n - i + 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            System.out.println();
        }
    }
}
