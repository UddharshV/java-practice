package practice_pack.strings;

public class ReverseString {
    //https://leetcode.com/problems/reverse-string/
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        char temp=' ';
        int left=0, right=s.length-1;
        while(left<right){
            temp=s[left];
            s[left]=s[right];
            left++;
            s[right]=temp;
            right--;
        }
        System.out.println(s);
    }
}
