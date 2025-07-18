package practice_pack.searchandsort;

public class RotationCountInRotatedSortedArray {
    //https://www.geeksforgeeks.org/dsa/find-rotation-count-rotated-sorted-array/
    public static void main(String[] args) {
        int[] nums = {12, 15, 18, 2, 3, 6};
        int pivotIndex = findPivotIndex(nums);
        System.out.println(pivotIndex);

    }
    static int findPivotIndex(int[] arr) {
        int start = 0, end = arr.length-1, mid;
        if(arr[start]>=arr[end]) {
            while (start <= end) {
                mid = start + (end - start) / 2;
                //while loop terminates when pivot element is found
                //check if the element next to mid is a pivot element
                if (mid < arr.length - 1 && arr[mid] > arr[mid + 1])
                    return mid + 1;
                //check if mid itself is the pivot element
                if (mid > 0 && arr[mid - 1] > arr[mid])
                    return mid;
                //pivot lies in right half
                if (arr[start] <= arr[mid])
                    start = mid + 1;
                    //pivot lies in left half
                else
                    end = mid;
            }
        }
        return 0;
    }
}
