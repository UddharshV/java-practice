package practice_pack.patterns;

import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            1 1 1 1 1
            2 2 2 2
            3 3 3
            4 4
            5
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
