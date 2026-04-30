package practice_pack.leetcode_prep;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //https://leetcode.com/problems/two-sum/description/
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] result = performOp(nums,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] performOp(int[] nums, int target) {

        HashMap <Integer, Integer> twoSumPair = new HashMap<>();
        for(int i=0; i<nums.length; i++)
            if(twoSumPair.containsKey(target-nums[i]))
                return new int[] {twoSumPair.get(target-nums[i]), i};
            else
                twoSumPair.put(nums[i],i);
        return new int[] {-1, -1};
    }
}
