package practice_pack.leetcode_prep;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits
import java.util.Scanner;

public class EvenDigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the 5 numbers one by one: ");
        for(int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();
        int count;
        count = performOpNum(arr);
        System.out.println("Count of Even Digit Numbers: " + count);
        count = performOpStrings(arr);
        System.out.println("Count of Even Digit Numbers: " + count);
        count = performOpLog(arr);
        System.out.println("Count of Even Digit Numbers: " + count);
    }

    static int performOpLog(int[] arr) {
        int count = 0;
        for(int num : arr)
            if((int)Math.log10(num)%2==0)
                count++;
        return count;
    }

    static int performOpStrings(int[] arr) {
        int count = 0;
        for(int x : arr)
            if(String.valueOf(x).length() % 2 == 0)
                count ++;
        return count;
    }

    static int performOpNum(int[] arr) {
        int count = 0;
        for (int num : arr){
            int counter = 0;
            while (num > 0) {
                num /= 10;
                counter++;
            }
            if(counter % 2 == 0)
                count ++;
        }
        return count;
//        int[] count = new int[arr.length];
//        for(int i = 0; i < 5; i++){
//            count[i] = 0;
//            int num = arr[i];
//            while(num > 0){
//                num /= 10;
//                count[i]++;
//            }
//        }
//        System.out.println("The even digit numbers are: ");
//        for (int i = 0; i < arr.length; i++) {
//            if (count[i] % 2 == 0)
//                System.out.print(arr[i] + " ");
//            System.out.println();
//        }
    }
}
