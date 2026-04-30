package practice_pack.leetcode_prep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        System.out.println("The longest substring in the given String is: " + findLongestSubstring2(s));
    }

    public static int findLongestSubstring2(String s) {
        int left=0, right=0, maxLen=1;
        if(s.isEmpty())
            return 0;
        HashSet <Character> subString = new HashSet<>();
        while(right<s.length()){
            if(!subString.contains(s.charAt(right))){
                subString.add(s.charAt(right));
                right++;
                maxLen=Math.max(subString.size(),maxLen);
            }
            else{
                subString.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }

    public static int findLongestSubstring(String s) {
        if(s.isEmpty())
            return 0;
        int left=0, right=0, maxLen=1;
        HashMap <Character, Integer> lastSeen = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            right++;
            if(lastSeen.containsKey(s.charAt(i)))
                if(lastSeen.get(s.charAt(i)) >= left)
                    left = lastSeen.get(s.charAt(i))+1;
            lastSeen.put(s.charAt(i),i);
            if(maxLen<right-left)
                maxLen = right-left;
        }
        return maxLen;
    }
}
