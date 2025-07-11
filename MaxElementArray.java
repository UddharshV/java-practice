package practice_pack.arrays;

import java.util.Arrays;

public class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = {9,2,3,4,5,34,392,3285};
        int maxEle = getMaxInArray(arr);
        System.out.println("The maximum element in - " + Arrays.toString(arr) + " is: " + maxEle);
        maxEle = getMaxInArray(arr, 0,5);
        System.out.println("The maximum element within the first five elements of - " + Arrays.toString(arr) + " is: " + maxEle);
    }

    static int getMaxInArray(int[] arr) {
        int maxEle = arr[0];
        if(arr.length == 0)
            return -1;
        for(int a : arr){
            if(a > maxEle)
                maxEle = a;
        }
        return maxEle;
    }
    static int getMaxInArray(int[] arr, int start, int end) {
        if(end > start)
            return -1;
        if(arr == null)
            return -1;
        int maxEle = arr[0];
        for(int i = start; i < end; i++){
            if(arr[i] > maxEle)
                maxEle = arr[i];
        }
        return maxEle;
    }

}
