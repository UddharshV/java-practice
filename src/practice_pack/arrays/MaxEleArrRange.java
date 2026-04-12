package practice_pack.arrays;

import java.util.Arrays;

public class MaxEleArrRange {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int index1 = 1, index2 = 2;
        int maxEle = maxEleInRange(arr,index1,index2);
        System.out.println(Arrays.toString(arr));
        System.out.println("The maximum element in the specified range is: " + maxEle);
    }
    static int maxEleInRange(int[] arr, int start, int end){

        //edge cases
        if(arr.length == -1)
            return -1;
        if(arr==null)
            return -1;
        if(end<start)
            return -1;

        int maxEle = arr[start];

        for(int i=start;i<=end;i++) {
            if (arr[i] > maxEle)
                maxEle = arr[i];
        }
        return maxEle;
    }
}
