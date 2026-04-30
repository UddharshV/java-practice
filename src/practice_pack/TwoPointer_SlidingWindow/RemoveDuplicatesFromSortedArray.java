package practice_pack.TwoPointer_SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicatesFromSortedArray {
    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int uniqueElementCount = removeDuplicates2(nums);
        System.out.println(uniqueElementCount);
    }

    public static int removeDuplicates2(int[] nums) {
        int left = 1;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[left - 1]) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length==1)
            return 1;
        int left=1, right=1,uniqueEleCounter=1;
        for(int i=0; i<nums.length;i++){
            if(right>=nums.length)
                break;
            if(nums[i]!=nums[right]){
                nums[left]=nums[right];
                left++;
                uniqueEleCounter++;
            }
            right++;
        }
        return uniqueEleCounter;
    }
}
