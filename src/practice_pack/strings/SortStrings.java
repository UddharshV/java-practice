package practice_pack.strings;

import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String str1 = "DBCGA";
        String str2 = "APPLE";
        String res1 = sortString(str1);
        String res2 = sortString(str2);
        System.out.println("Sorted strings: " + res1 + "; " + res2);
    }
    public static String sortString(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

}
