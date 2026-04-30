package practice_pack.arrays;

import java.util.Arrays;

public class MaxSubArray {
    //https://leetcode.com/problems/maximum-subarray/
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArraySum(nums));
        System.out.println(Arrays.toString(findMaxSubArray(nums)));
    }
    public static int[] findMaxSubArray(int[] nums) {
        if(nums.length==1)
            return new int[]{0,0};
        int max = Integer.MIN_VALUE;
        int sum=0, start=-1, end=-1;
        for (int i=0; i<nums.length; i++) {
            if(sum==0)
                start=i;
            sum += nums[i];

            if (sum > max){
                max = sum;
                end=i;
            }

            if (sum < 0)
                sum = 0;
        }
        return new int[] {start,end};
    }
    public static int maxSubArraySum(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int max = Integer.MIN_VALUE;
        int sum=0;
        for (int num : nums) {
            sum += num;

            if (sum > max)
                max = sum;

            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
