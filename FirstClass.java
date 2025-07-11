package practice_pack.basics;

import java.util.Scanner;

public class FirstClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello, World!");
        System.out.println(" Excited for what's to come!");
        System.out.println("What is your name?");
        String inp = sc.nextLine();
        System.out.println("Welcome " + inp +"!");
    }
}