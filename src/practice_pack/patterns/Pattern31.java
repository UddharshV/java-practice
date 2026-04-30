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
        int lowerBound, upperBound, leftBound, rightBound, minBound;
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                lowerBound = i;
                upperBound = 2*n-2-i;
                leftBound = j;
                rightBound = 2*n-2-j;

                minBound = Math.min(Math.min(Math.min(lowerBound, upperBound), leftBound), rightBound);

                System.out.print(n-minBound + " ");
            }
            System.out.println();
        }
    }
}
