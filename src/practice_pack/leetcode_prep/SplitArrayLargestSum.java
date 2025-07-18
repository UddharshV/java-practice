package practice_pack.leetcode_prep;

public class SplitArrayLargestSum {
    //https://leetcode.com/problems/split-array-largest-sum/description/
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        int[] range = findSumRange(nums);
        int largestSum = optimalSum(nums,k,range);
        System.out.println(largestSum);
    }

    static int optimalSum(int[] nums, int k, int[] range) {
        int start = range[0], end = range[1], mid = start;
        while(start<end){
            mid = start + (end-start)/2;
            boolean flag = findLargestSum(nums,k,mid);
            if(flag)
                end = mid;
            else
                start = mid+1;
        }
        return start;
    }

    static boolean findLargestSum(int[] nums, int k, int mid) {
        int sum = 0, count = 1;
        for(int i : nums){
            if(sum+i>mid){
                count++;
                sum = i;
            }
            else
                sum += i;
        }
        return count <= k;
    }

    static int[] findSumRange(int[] nums) {
        int sum = 0,max=Integer.MIN_VALUE;
        for(int i : nums){
            sum += i;
            if(i>max)
                max = i;
        }
        return new int[] {max,sum};
    }

}
