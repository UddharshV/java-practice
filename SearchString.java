package practice_pack.searchandsort;

import java.util.Arrays;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character to search in the given string: ");
        char key = sc.next().trim().charAt(0);
        int index = searchStringOp(str, key);
        boolean res = searchStringOp2(str, key);
        System.out.println("The specified character - " + key + " was found at index position: " + index + " in the given string: " + str + "(true / false): " + res);
        System.out.println("The given input string for your reference was: " + Arrays.toString(str.toCharArray()));
    }

    static boolean searchStringOp2(String str, char key) {
        if(str.isEmpty())
            return false;
        for(char ch : str.toCharArray())
            if(ch == key)
                return true;
        return false;
    }

    static int searchStringOp(String str, char key) {
        if(str.isEmpty())
            return -1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==key)
                return i+1;
        }
        return -1;
    }
}
