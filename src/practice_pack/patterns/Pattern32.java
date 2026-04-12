package practice_pack.patterns;

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            E
            D E
            C D E
            B C D E
            A B C D E
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        char ch = (char)(65+n-1), temp;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(ch-i+j) + " ");
            }
            System.out.println();
        }
    }
}
