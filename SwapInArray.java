package practice_pack.arrays;

import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Array before performing swap operation: " + Arrays.toString(arr));
        perfSwapOp(arr,3,4);
        System.out.println("Array after performing swap operation: " + Arrays.toString(arr));
        int[] arr2 = {1,2,3,4,5};
        perfRevOp(arr2);
        System.out.println("The array in reverse is: " + Arrays.toString(arr2));
    }

    static void perfRevOp(int[] arr) {
        int start = 0, end = arr.length-1;
        while(start<end){
            perfSwapOp(arr,start,end);
            start++; end--;
        }
    }

    static void perfSwapOp(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
