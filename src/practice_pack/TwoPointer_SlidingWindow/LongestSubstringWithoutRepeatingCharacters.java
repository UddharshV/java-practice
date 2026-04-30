package practice_pack.TwoPointer_SlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("The longest substring in the given String is: " + findLongestSubstring2(s));

    }

    public static int findLongestSubstring2(String inputString) {
        if(inputString.isEmpty())
            return 0;
        int left=0, right=0;
        int length, maxLength=1;
        HashMap <Character,Integer> characterIndexes = new HashMap<>();
        while(right<inputString.length()){
            if(characterIndexes.containsKey(inputString.charAt(right)))
                left=Math.max(left,characterIndexes.get(inputString.charAt(right))+1);

            characterIndexes.put(inputString.charAt(right),right);

            length=right-left+1;
            right++;

            maxLength = Math.max(length,maxLength);
        }
        return maxLength;
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
