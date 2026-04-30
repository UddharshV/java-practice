package practice_pack.strings;

public class LongestCommonPrefix {
    //https://leetcode.com/problems/longest-common-prefix/description/
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String res = longestCommonPrefix2(strs);
        System.out.println(res);
    }

    public static String longestCommonPrefix2(String[] strs) {
        String prefix=strs[0];
        for(int i=1; i< strs.length; i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }

    public static String longestCommonPrefix(String[] strs) {
        int smallestStringLen=Integer.MAX_VALUE;
        StringBuilder leastCommonPrefix = new StringBuilder();
        for(String str:strs)
            smallestStringLen=Math.min(smallestStringLen,str.length());
        int left=0;
        while(left<smallestStringLen){
            char leftCharacter = strs[0].charAt(left);
            for(int i = 1; i < strs.length; i++){
                if(leftCharacter != strs[i].charAt(left))
                    return leastCommonPrefix.toString(); // stop immediately
            }
            leastCommonPrefix.append(leftCharacter);
            left++;
        }
        return leastCommonPrefix.toString();
    }

}
