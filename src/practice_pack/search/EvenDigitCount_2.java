package practice_pack.search;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits
import java.util.Scanner;

public class EvenDigitCount_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {12,345,2,6,7896};
        int res = evenDigitCounter(nums);
        System.out.println("The total numbers of even digit numbers are: " + res);
    }

    public static int evenDigitCounter(int[] nums) {
        int count = 0;
        for(int ele:nums){
            if((int)(Math.log10(ele))%2!=0)
                count++;
        }
        return count;
    }
}
