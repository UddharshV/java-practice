package practice_pack.basics;

import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt(), num = n;
        int sum = 0;
        while(n>0){
            int d = n%10;
            sum = sum*10+d;
            n = n/10;
        }
        System.out.println("The given number - " + num + " in reverse is: " + sum);
    }
}
