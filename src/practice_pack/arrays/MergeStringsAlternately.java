package practice_pack.arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MergeStringsAlternately {
    //https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter the first input string:");
        str1 = sc.next();
        System.out.println("Enter the second input string:");
        str2 = sc.next();
        String res = mergeAlternately(str1,str2);
        System.out.println(res);
    }
    static String mergeAlternately(String word1, String word2){
        char[] s1 = word1.toCharArray();
        char[] s2 = word2.toCharArray();
        String res = "";
        int i=0,j = 0; //to track s2's characters
        while(i<s1.length){
            res+=Character.toString(s1[i]);
            i++;
            if(j<s2.length){
                res+=Character.toString(s2[j]);
                j++;
            }
        }
        while(j<s2.length){
            res+=Character.toString(s2[j]);
            j++;
        }
        return res;
    }



}
