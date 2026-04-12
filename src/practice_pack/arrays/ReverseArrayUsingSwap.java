package practice_pack.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayUsingSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
//        int index1=0,index2=arr.length-1;
//        swap(arr,index1,index2);
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArr(int[] nums){
//        int j = nums.length-1;
//        for(int i=0;i<nums.length/2;i++){
//            int temp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
//            j--;
//        }
        int j = nums.length - 1;
        for(int i=0; i<nums.length/2;i++) {
            swap(nums, i, j);
            j--;
        }
    }
    static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
