package practice_pack.strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input string: ");
        String str = sc.next();
        boolean res = checkPalindrome(str);
        System.out.println(res);
    }
    public static boolean checkPalindrome(String str){
        if(str == null || str.isEmpty())
            return true;
        int start = 0, end = str.length()-1;
        while(start<end && str.charAt(start)==str.charAt(end)){
            start++;
            end--;
        }
        return start>=end;
    }
}
