package practice_pack.searchandsort;

public class PivotRotatedSortedArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 1, 1, 1, 1};
        int pivot = findPivot(arr);
        System.out.println(pivot);
    }

    static int findPivot(int[] arr) {
        int start = 0, end = arr.length-1, mid;
        if(arr[start]<arr[end])
            return 0;

        while (start <= end) {
            //trim duplicates at start after checking for pivot.
            while (start < end && arr[start] == arr[start + 1]) {
                if (arr[start] > arr[start + 1]) return start + 1;
                start++;
            }
            //trim duplicates at start after checking for pivot.
            while (start < end && arr[end] == arr[end - 1]) {
                if (arr[end - 1] > arr[end]) return end;
                end--;
            }
            if(start>=end)
                break;
            mid = start + (end - start) / 2;
            //while loop terminates when pivot element is found
            //check if the element next to mid is a pivot element
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1])
                return mid + 1;
            //check if mid itself is the pivot element
            if (mid > 0 && arr[mid - 1] > arr[mid])
                return mid;
            //pivot lies in right half
            if (arr[start] < arr[mid])
                start = mid + 1;
            //pivot lies in left half
            else
                end = mid;
        }
        return 0;
    }
}
