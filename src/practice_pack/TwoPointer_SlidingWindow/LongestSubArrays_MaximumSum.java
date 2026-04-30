package practice_pack.TwoPointer_SlidingWindow;

import java.util.Arrays;

public class LongestSubArrays_MaximumSum {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,10};
        int target = 14;
        int[] res = findLongestSubArrayMaxSum(arr,target);

        System.out.println(Arrays.toString(res));
    }

    public static int[] findLongestSubArrayMaxSum(int[] arr, int target) {
        int left=0, right=0;
        int sum=0, maxLength=0,maxSum=0;
        int[] indexes = new int[2];
        while(right<arr.length){
            sum+=arr[right];

            if(sum>target){
                sum-=arr[left];
                left++;
            }
            if(sum<=target){
                if(maxSum<=sum){
                    maxSum=sum;
                    maxLength = Math.max(maxLength,right-left+1);
                    indexes[0]=left;
                    indexes[1]=right;
                }
            }
            right++;
        }
        return indexes;
    }
}
