package practice_pack.patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
         */
        System.out.println("Enter the number of lines to print the above pattern");
        int n = sc.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2!=0){
                    if(j%2==0)
                        System.out.print(0 + " ");
                    else
                        System.out.print(1 + " ");
                }
                else {
                    if (j % 2 != 0)
                        System.out.print(0 + " ");
                    else
                        System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}
