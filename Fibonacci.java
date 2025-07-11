package practice_pack.basics;

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of fibonacci terms to be displayed:");
        int n = sc.nextInt();
        System.out.print(num1 + " " + num2);
        int sum = num1 + num2;
  for(int i=2; i<n; i++){
            System.out.print(" ");
            System.out.print(sum);
            num1 = num2;
            num2 = sum;
            sum = num1 + num2;
        }
        System.out.println();
        System.out.println(n + "fibonacci number: " + num2);
    }
}
