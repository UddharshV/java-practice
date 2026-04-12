package practice_pack.arrays;

import java.util.Scanner;

public class StringsGCD {
    //https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter the first input string:");
        str1 = sc.next();
        System.out.println("Enter the second input string:");
        str2 = sc.next();
        String res = checkStringsGCD(str1,str2);
        System.out.println(res);
    }
    static String checkStringsGCD(String str1, String str2) {
        String gcd = "";
        char[] w1 = str1.toCharArray();
        char[] w2 = str2.toCharArray();
        int i = 0, len1 = str1.length(), len2 = str2.length();

        return "";
    }
}
