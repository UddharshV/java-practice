package practice_pack.patterns;

import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            4 4 4 4 4 4 4
            4 3 3 3 3 3 4
            4 3 2 2 2 3 4
            4 3 2 1 2 3 4
            4 3 2 2 2 3 4
            4 3 3 3 3 3 4
            4 4 4 4 4 4 4
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        int rowMin = 0, rowMax = 2*n-1, colMin = 0, colMax = 2*n-1;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=2*n; j++){

            }
        }
    }
}
