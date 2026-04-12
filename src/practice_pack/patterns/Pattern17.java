package practice_pack.patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
             1
            212
           32123
          4321234
           32123
            212
             1
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }

    public static void displayPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            for(int j=i; j>=1; j--)
                System.out.print(j);
            for(int j=2; j<=i;j++)
                System.out.print(j);
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            for(int j=i; j>=1; j--)
                System.out.print(j);
            for(int j=2; j<=i;j++)
                System.out.print(j);
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
