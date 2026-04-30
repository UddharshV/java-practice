package practice_pack.TwoPointer_SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubarraySubstring_Condition {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,10};
        int target = 14;
        int longestSubArrayLength = findLongestSubArrayOptimal(arr,target);

        System.out.println(longestSubArrayLength);
    }

    public static int findLongestSubArrayOptimal(int[] arr, int target) {
        int left=0, right=0;
        int sum=0, maxLength=0;
        while(right<arr.length){
            sum+=arr[right];
            if(sum>target){
                sum-=arr[left];
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }
        return maxLength;
    }

    public static int findLongestSubArrayImproved(int[] arr, int target) {
        int left=0, right=0;
        int sum=0, maxLength=0;
        while(right<arr.length){

            sum+=arr[right];

            while(sum>target){
                sum-=arr[left];
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }

    public static int findLongestSubArrayBF(int[] arr, int target) {
        //Brute-ForceApproach
        int sum=0, maxLength=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum<=target)
                    if(maxLength<j-i+1)
                        maxLength=j-i+1;
                else
                    break;
            }
        }
        return maxLength;
    }
}
