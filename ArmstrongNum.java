package practice_pack.basics;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The given number " + num + " is armstrong. (True / False): " + isArmstrongNum(num));
    }
    public static boolean isArmstrongNum(int num){
        int sum=0,d,n=num;
        while(n>0){
            d = n%10;
            sum += (int) Math.pow(d,3);
            n = n/10;
        }
        return sum == num;
    }
}
