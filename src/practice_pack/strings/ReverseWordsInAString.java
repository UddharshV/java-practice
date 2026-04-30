package practice_pack.strings;

public class ReverseWordsInAString {
    //https://leetcode.com/problems/reverse-words-in-a-string/
    public static void main(String[] args) {
        String s = "the sky is    blue";
        String res = reverseWord(s);
        System.out.println(res);
    }
    public static String reverseWord(String s){
        String reversed="";
        s=s.trim();
        if(s.length()<=1)
            return s;
        int left=s.length()-1, right=s.length();
        while(left>=0){
            if(s.charAt(left)==' '){
                reversed+=s.substring(left+1, right);
                reversed+=" ";
                left--;
                while(s.charAt(left)==' ')
                    left--;
                right=left+1;
            }
            left--;
        }
        reversed+=s.substring(left+1, right);
        return reversed;
    }
}
