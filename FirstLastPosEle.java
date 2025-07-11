package practice_pack.leetcode_prep;

import java.util.Arrays;

public class FirstLastPosEle {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,2,3,4,4,5,5,5,6,7,8,8,8,8};
        int target = 8;
        int res1=performBinarySearch(nums,target,false);
        int res2=performBinarySearch(nums,target,true);
        System.out.println(Arrays.toString(new int[] {res1,res2}));
    }

    static int performBinarySearch(int[] nums, int target,boolean flag) {
        int left = 0, right = nums.length-1,mid,result=-1;
        while(left<=right){
           mid = left + (right-left)/2;
           if(nums[mid]==target){
               result=mid;
               if(flag)
                   left=mid+1;
               else
                   right=mid-1;
           }
           if(nums[mid]<target)
               left=mid+1;
           if(nums[mid]>target)
               right=mid-1;
        }
        return result;
    }
}
