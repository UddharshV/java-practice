package practice_pack.patterns;

import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            1 2 3 4  17 18 19 20
              5 6 7  14 15 16
                8 9  12 13
                  10 11
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        int[] arr = new int[n*n+n];

    }
}
