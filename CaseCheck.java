package practice_pack.basics;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input");
        char ch = sc.next().trim().charAt(0);
        if(ch>=97 && ch<=122)
            System.out.println("The first character of the given input is a lowercase letter!");
        else if(ch>=65 && ch<=90)
            System.out.println("The first character of the given input is an uppercase letter!");
        else
            System.out.println("The first character is not an alphabet!");
    }
}
