package practice_pack.patterns;

import java.util.Arrays;
import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
             1
            1  1
           1  2  1
          1  3  3  1
         1  4  6  4  1
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        int[] arr = new int[n];
        arr[0] = 1;
        for(int i=0; i<n;i++) {
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            for(int j=0; j<=i; j++)
                System.out.print(arr[j] + " ");
            for (int j = i+1; j > 0 && j<n; j--)
                arr[j] += arr[j - 1];
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
