package practice_pack.searchandsort;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the array element to be found within the array's first five elements: ");
        int key = sc.nextInt();
        int index = performSearchOp(arr, key, 0, 5);
        System.out.println("The element - " + key + " was found at index positon - " + index + " of the array: " + Arrays.toString(arr));
    }

    static int performSearchOp(int[] arr, int key, int start, int end) {
        if(start>end)
            return -1;
        if(arr == null)
            return -1;
        for(int i = start; i < end; i++)
            if(arr[i]==key)
                return i+1;
        return -1;
    }
}
