package practice_pack.leetcode_prep;

public class SmallestLetterGreaterThanTarget {
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'f';
        int resindex = performBinarySearch(letters,target);
        System.out.println(letters[resindex]);
    }

    static int performBinarySearch(char[] arr, char target) {
        int start = 0, end = arr.length - 1, mid;
        while(start <= end){
            mid = start + (end-start)/2;
            if(arr[mid] < target)
                start = mid + 1;
            if(arr[mid] > target)
                end = mid - 1;
            if(arr[mid] == target)
                start = mid + 1;
        }
        return start % arr.length;
    }
}
