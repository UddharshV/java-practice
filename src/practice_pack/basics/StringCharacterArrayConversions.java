package practice_pack.basics;

import java.util.Arrays;
import java.util.Scanner;

public class StringCharacterArrayConversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString;
        System.out.println("Enter the input string: ");
        inputString = sc.next();
        performOp(inputString);
    }
    public static void performOp(String inpString){
//        StringBuilder sb = new StringBuilder();
//        char[] characterArray = new char[inpString.length()];
//        for(int i=0; i<inpString.length(); i++) {
//            characterArray[i] = inpString.charAt(inpString.length() - i - 1);
//            sb.append(characterArray[i]);
//        }
//        String result = sb.toString();
//        System.out.println(Arrays.toString(characterArray));
//        System.out.println(result);
        char[] characterArray = inpString.toCharArray();
        int left = 0, right = inpString.length()-1;
        while(left < right){
            char temp = characterArray[left];
            characterArray[left] = characterArray[right];
            characterArray[right] = temp;
            left++;
            right--;
        }
        String reversedString = new String(characterArray);
        System.out.println(reversedString);

    }
}
