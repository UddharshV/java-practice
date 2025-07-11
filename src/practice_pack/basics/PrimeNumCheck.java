package practice_pack.basics;

import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n<=1)
            System.out.println("Neither prime nor composite.");
        else
            System.out.println("The given number: " + n + " is prime. (True /False): " + isPrime(n));
    }
    public static boolean isPrime(int num){
        if(num==2)
            return true;
        if(num%2==0) //even divisors checked
            return false;
        int root = (int) Math.sqrt(num);
        for(int i=3;i<=root;i+=2){ //odd divisors checked
            if(num%i==0)
                return false;
        }
        return true;
    }
}
