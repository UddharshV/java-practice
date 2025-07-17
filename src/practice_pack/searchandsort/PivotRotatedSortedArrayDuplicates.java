package practice_pack.searchandsort;

public class PivotRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1};
        int pivot = findPivot(arr);
        System.out.println(pivot);
    }

    static int findPivot(int[] arr) {
        int start = 0, end = arr.length-1, mid;
        if(arr[start]<arr[end])
            return 0;
        while(start<=end){
            mid = start + (end-start)/2;
            //while loop terminates when pivot element is found
            //check if the element next to mid is a pivot element
            if(mid<arr.length-1 && arr[mid]>arr[mid+1])
                return mid+1;
            //check if mid itself is the pivot element
            if(mid>0 && arr[mid-1]>arr[mid])
                return mid;
            //pivot lies in right half
            if(arr[start]<=arr[mid])
                start = mid+1;
            //pivot lies in left half
            else
                end = mid;
        }
        return 0;
    }
}
