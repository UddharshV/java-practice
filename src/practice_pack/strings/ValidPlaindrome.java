package practice_pack.strings;

import java.util.ArrayList;
import java.util.List;

public class ValidPlaindrome {
    //https://leetcode.com/problems/valid-palindrome/description/
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome2(s));
    }

    public static boolean isPalindrome2(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char leftCharacter = s.charAt(left), rightCharacter = s.charAt(right);

            if (leftCharacter >= 'a' && leftCharacter <= 'z' || leftCharacter >= 'A' && leftCharacter <= 'Z' || leftCharacter >= '0' && leftCharacter <= '9') {
                if (leftCharacter >= 'A' && leftCharacter <= 'Z')
                    leftCharacter = (char) (leftCharacter + 32);
            }
            else{
                left++;
                continue;
            }

            if (rightCharacter >= 'a' && rightCharacter <= 'z' || rightCharacter >= 'A' && rightCharacter <= 'Z' || rightCharacter >= '0' && rightCharacter <= '9') {
                if (rightCharacter >= 'A' && rightCharacter <= 'Z')
                    rightCharacter = (char) (rightCharacter + 32);
            }
            else{
                right--;
                continue;
            }

            if (leftCharacter == rightCharacter) {
                left++;
                right--;
            } else
                return false;
        }
        return true;
    }
}
