package practice_pack.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseVowelsString {
    //https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the input string:");
        s = sc.next();
        String res = myfunc(s);
        System.out.println(res);
    }
    public static String myfunc(String s){
        char[] ch = s.toCharArray();
        String res="";
        char temp;
        ArrayList <Character> vowels = new ArrayList<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int j = s.length()-1;
        for(int i=0;i<s.length();i++){
            if(i>=j)
                break;
            if(vowels.contains(ch[i])){
                while(!(vowels.contains(ch[j])) && (j>0))
                    j--;
            if(ch[i]!=ch[j]) {
                temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }
            j--;
            }
        }
        res = Arrays.toString(ch);
        return res;
    }
}
