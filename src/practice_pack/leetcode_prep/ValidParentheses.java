package practice_pack.leetcode_prep;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class ValidParentheses {
    //https://leetcode.com/problems/valid-parentheses/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String: ");
        String s = sc.next();
        System.out.println(checkValidity(s));
    }

    public static boolean checkValidity(String s) {
        Deque<Character> inpStringQ = new ArrayDeque<>();
        HashMap <Character, Character> bracketPairs = new HashMap<>();

        bracketPairs.put(')','(');
        bracketPairs.put('}','{');
        bracketPairs.put(']','[');

        for(int i=0; i<s.length(); i++){
            if(bracketPairs.get(s.charAt(i)) != null)
                if(!inpStringQ.isEmpty() && (inpStringQ.peek() == bracketPairs.get(s.charAt(i))))
                    inpStringQ.pop();
                else
                    return false;
            else
                inpStringQ.push(s.charAt(i));
        }

        return inpStringQ.isEmpty();
    }
}
