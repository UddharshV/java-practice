package practice_pack.leetcode_prep.Leetcode75;

import java.util.*;

public class CloseStrings {
    //https://leetcode.com/problems/determine-if-two-strings-are-close/description/?envType=study-plan-v2&envId=leetcode-75
    public static void main(String[] args) {
        String word1 = "cabbba", word2 = "abbccc";
        System.out.println(closeStringsOptimized(word1,word2));
    }

    public static boolean closeStringsOptimized(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;
        //using array of length 26
        int[] freqArr1 = new int[26];
        int[] freqArr2 = new int[26];
        char[] word1Chars = word1.toCharArray();
        char[] word2Chars= word2.toCharArray();
        for(char ch: word1Chars)
            freqArr1[ch-'a']++;
        for(char ch: word2Chars)
            freqArr2[ch-'a']++;
        //compare character sets
        for(int i=0; i<26; i++)
            if(freqArr1[i]==0 && freqArr2[i]!=0 || freqArr1[i]!=0 && freqArr2[i]==0)
                return false;
        Arrays.sort(freqArr1);
        Arrays.sort(freqArr2);
        return Arrays.equals(freqArr1, freqArr2);
    }

    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;
        HashMap <Character, Integer> charFreqs1 = new HashMap();
        HashMap <Character, Integer> charFreqs2 = new HashMap();
        char[] word1Characters = word1.toCharArray();
        char[] word2Characters = word2.toCharArray();
        //Store characters and frequencies in a hashmap
        for(char ch: word1Characters)
            charFreqs1.put(ch, charFreqs1.getOrDefault(ch,0) + 1);
        for(char ch: word2Characters)
            charFreqs2.put(ch, charFreqs2.getOrDefault(ch,0) + 1);
        //Create sorted list of frequencies
        ArrayList<Integer> freqList1 = new ArrayList<>(charFreqs1.values());
        freqList1.sort(null);
        ArrayList<Integer> freqList2 = new ArrayList<>(charFreqs2.values());
        freqList2.sort(null);

        //compare character sets
        if(!charFreqs1.keySet().equals(charFreqs2.keySet()))
            return false;
        //compare sorted frequency lists
        return freqList1.equals(freqList2);
    }
}
