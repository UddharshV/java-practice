package practice_pack.basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of its digits");
        int num = sc.nextInt();
        int sum = 0, d, n=num;
        while(n>0){
            d = n % 10;
            sum += d;
            n /= 10;
        }
        System.out.println("The sum of digits for the given number: " + num + " is: " + sum);
    }
}
