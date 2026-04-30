package practice_pack.strings;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramCheck {
    public static void main(String[] args) {
        String one = "abb";
        String two = "bba";
        System.out.println(checkAnagram3(one, two));
    }

    private static boolean checkAnagram3(String one, String two) {
        if (one.length() != two.length())
            return false;
        if(one.isEmpty())
            return true;
        return sortString(one).equals(sortString(two));
    }

    public static String sortString(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    public static boolean checkAnagram(String one, String two) {
        HashMap<Character, Integer> freqCount1 = new HashMap<>();
        HashMap<Character, Integer> freqCount2 = new HashMap<>();
        if (one.length() != two.length())
            return false;
        for (int i = 0; i < one.length(); i++) {
            if (!freqCount1.containsKey(one.charAt(i)))
                freqCount1.put(one.charAt(i), 1);
            else
                freqCount1.put(one.charAt(i), freqCount1.get(one.charAt(i)) + 1);

            if (!freqCount2.containsKey(two.charAt(i)))
                freqCount2.put(two.charAt(i), 1);
            else
                freqCount2.put(two.charAt(i), freqCount1.get(two.charAt(i)) + 1);
        }
        for (char ch : freqCount1.keySet()) {
            if (freqCount1.get(ch) != freqCount2.get(ch))
                return false;
        }
        return true;
    }

    public static boolean checkAnagram2(String one, String two) {

        if (one.length() != two.length())
            return false;

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
}
