package practice_pack.basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Widening Conversion - Implicit
        float num1 = 99;
        long num2 = 9;
        //Narrowing Conversion - Explicit
        int num3 = (int) 99.99;
        // Automatic Type Promotion - Examples
        // Example 1
        int a = 257;
        byte b = (byte) a; // 257 % 256 = 1
        System.out.println("b's value: " + b);
        byte c = 40, d = 50, e = 100;
        int f = (c * d) / e; // Here c*d is automatically promoted to int to store the result in f
        System.out.println("f's value: " + f);
        /* Example 2 for automatic type promotion
        byte g = 50;
        g *= 2; // Here g*2 is automatically promoted to int and cannot be stored in g (byte type) implicitly.
         */
        //Example 3
        int h = 'A';
        System.out.println("h's value: " + h); // 65
    }
}
