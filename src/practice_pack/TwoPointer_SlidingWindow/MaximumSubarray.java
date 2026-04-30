package practice_pack.TwoPointer_SlidingWindow;

import java.util.Arrays;

public class MaximumSubarray {
    //https://leetcode.com/problems/maximum-subarray/
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] res = findLargestSumSubArray(arr);

        System.out.println(Arrays.toString(res));
    }

    public static int[] findLargestSumSubArray(int[] nums) {
        return new int[] {-1,-1};
    }
}
