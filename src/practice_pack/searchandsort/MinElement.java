package practice_pack.searchandsort;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();
        findMin(arr);
    }

    static void findMin(int[] arr) {
        int min;
        if(arr != null){
            min = arr[0];
            for (int ele : arr)
                if (min > ele)
                    min = ele;
            System.out.println("The minimum element - " + min + " within the given array: " + Arrays.toString(arr));
        }
    }
}
