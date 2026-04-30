package practice_pack.patterns;

import java.util.Arrays;
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
        displayPattern2(n);
    }
//    public static void displayPattern(int n){
//        int[] left = new int[(n)*(n+1)/2];
//        int[] right = new int[(n)*(n+1)/2];
//
//        for(int i=0; i<(n)*(n+1)/2; i++)
//            left[i] = i+1;
//
//        int k = 2, temp = n*(n+1)/2 + 1;
//        right[(n)*(n+1)/2-1] = temp;
//        temp++;
//        for(int i=((n)*(n+1)/2)-1-k; i>=0; i=i-k){
//            for(int j=1; j<=k; j++){
//                right[i+j-1] = temp;
//                temp++;
//            }
//
//            k++;
//        }
//        int l=0;
//        int width = String.valueOf(n*(n+1)).length();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<i;j++)
//                System.out.print("  ");
//            for(int j=0; j<=n-i;j++)
//                System.out.printf("%-" + width + "d ", left[l+j]);
//
//            System.out.print("  ");
//
//            for(int j=0; j<=n-i;j++)
//                System.out.printf("%-" + width + "d ", right[l+j]);
//
//            l+=n-i+1;
//
//            System.out.println();
//        }
//    }
    public static void displayPattern2(int n){

    }
}
