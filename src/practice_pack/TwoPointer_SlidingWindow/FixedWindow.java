package practice_pack.TwoPointer_SlidingWindow;

import com.sun.nio.sctp.SctpStandardSocketOptions;

public class FixedWindow {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,3,4,5,-1};
        int windowSize = 4;
        int maxSum = findMaxSum(arr,windowSize);
        System.out.println(maxSum);
    }

    public static int findMaxSum(int[] arr, int windowSize) {
        int start=0, end=windowSize-1;
        int sum=0, maxSum=0;
        for(int i=start; i<=end; i++)
            sum+=arr[i];
        while(end<arr.length-1){
            sum-=arr[start];
            start++;
            end++;
            sum+=arr[end];
            if(sum>maxSum)
                maxSum=sum;
        }
        return maxSum;
    }

}
