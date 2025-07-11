package practice_pack.basics;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt(), num = n;
        System.out.println("Enter the digit that needs to be checked for the number of occurrences in the given number:");
        int dig = sc.nextInt(), count = 0;
        while(n>0){
            int d = n%10;
            if(d==dig)
                count++;
            n=n/10;
        }
        System.out.println("The number of occurrences of the given digit - " + dig + " in the given number - " + num + " is: " + count);
    }
}
