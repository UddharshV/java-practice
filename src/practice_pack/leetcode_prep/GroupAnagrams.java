package practice_pack.leetcode_prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"",""};
        List<List<String>> anagramSet = new ArrayList<>();
        anagramSet = groupAnagrams(strs);
        System.out.println(anagramSet);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        if(strs==null)
            return result;

        HashMap <String,List<String>> anagramMap = new HashMap<>();


        for(int i=0; i<strs.length; i++){
            List<String> anagrams = new ArrayList<>();
            String sortedStr = sortString(strs[i]);
            if(!anagramMap.containsKey(sortedStr)){
                anagrams.add(strs[i]);
                anagramMap.put(sortedStr,anagrams);
            }
            else
                anagramMap.get(sortedStr).add(strs[i]);
        }

        for(String str: anagramMap.keySet())
            result.add(anagramMap.get(str));

        return result;
    }
    public static String sortString(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    public static boolean checkAnagram2(String one, String two) {
        if (one.length() != two.length())
            return false;

        if(one.isEmpty())
            return true;

        int[] characterCounter = new int[26];

        for (int i = 0; i < one.length(); i++) {
            int temp = one.charAt(i) - 'a';
            characterCounter[temp] += 1;
        }
        for (int i = 0; i < two.length(); i++) {
            int temp = two.charAt(i) - 'a';
            characterCounter[temp] -= 1;
        }
        for (int count : characterCounter) {
            if (count != 0)
                return false;
        }
        return true;
    }
    public static List<List<String>> groupAnagramsDuplicateFailure(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        if(strs==null)
            return result;

        HashMap <String,Integer> anagramID = new HashMap<>();
        int bucketCount=0;
        for(int i=0; i<strs.length; i++){
            if(anagramID.containsKey(strs[i]))
                continue;
            bucketCount++;
            anagramID.put(strs[i],bucketCount);
            if(i==strs.length-1)
                break;
            for(int j=i+1; j<strs.length; j++){
                if(checkAnagram2(strs[i], strs[j]))
                    anagramID.put(strs[j],bucketCount);
            }
        }
        HashMap<Integer,List<String>> groupedAnagrams = new HashMap<>();
        for(int i=0; i<bucketCount; i++){
            ArrayList<String> anagramList = new ArrayList<>();
            for(String str: anagramID.keySet()){
                if(anagramID.get(str)==i+1)
                    anagramList.add(str);
            }
            groupedAnagrams.put(i,anagramList);
        }
        for(int i=0; i<groupedAnagrams.size(); i++)
            result.add(groupedAnagrams.get(i));
        return result;
    }
}
