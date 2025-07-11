package practice_pack.searchandsort;

public class SearchTwoDimArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 18;
        System.out.println(searchOp(arr,target));
    }

    static boolean searchOp(int[][] arr, int target) {
        for( int[] a : arr)
            for(int x : a)
                if(x == target)
                    return true;
        return false;
    }
}
