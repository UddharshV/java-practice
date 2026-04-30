package practice_pack.Recursion;

public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {9,27,45,63,81};
        int index = findElement(arr,63, 0, arr.length-1);
        System.out.println(index);
    }

    public static int findElement(int[] arr, int target, int start, int end) {
        if(start>end)
            return -1;

        int mid = start+(end-start)/2;

        if(target==arr[mid])
            return mid;
        else if(target < arr[mid])
            return findElement(arr,target,start,mid-1);
        else
            return findElement(arr,target,mid+1,end);
    }

}
