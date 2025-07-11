package practice_pack.searchandsort;

import java.util.Arrays;

public class FloorNumTarget {
    // Find the largest number in the array which is smaller than or equal to the specified target.
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = -9;
        int res = performBinarySearch(arr,target);
        if(res > 0)
            System.out.println(arr[res]);
        else
            System.out.println("No number in given list - " + Arrays.toString(arr) + ", that is smaller than the target number: " + target);
    }

    static int performBinarySearch(int[] arr, int target) {
//        int start = 0, end = arr.length -1, mid, index = -1;
//        while(start <= end){
//            mid = start + (int) (end-start)/2;
//            if(arr[mid] < target)
//                start = mid + 1;
//            if(arr[mid] > target){
//                index = mid;
//                end = mid - 1;
//            }
//            if(arr[mid] == target)
//                return mid;
//        }
//        return index;
        int start = 0, end = arr.length -1, mid;
        while(start <= end){
            mid = start + (end-start)/2;
            if(arr[mid] < target)
                start = mid + 1;
            if(arr[mid] > target)
                end = mid - 1;
            if(arr[mid] == target)
                return mid;
        }
        return end;
    }
}
