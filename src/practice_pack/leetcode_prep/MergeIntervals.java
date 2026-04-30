package practice_pack.leetcode_prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    //https://leetcode.com/problems/merge-intervals/description/
    public static void main(String[] args) {
        int[][] intervals = {{4,7},{1,4}};
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[][] result = findSolution(intervals);
        for(int[] nonOverlappingInterval : result)
            System.out.println(Arrays.toString(nonOverlappingInterval));
    }

    public static int[][] findSolution(int[][] intervals) {
        List <int[]> nonOverlappingIntervals = new ArrayList<>();
        if(intervals==null || intervals.length==0)
            return nonOverlappingIntervals.toArray(new int[0][]);

        int[] prev = intervals[0];
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]<=prev[1]){
                prev[1] = Math.max(intervals[i][1], prev[1]);
            }
            else{
                nonOverlappingIntervals.add(prev);
                prev=intervals[i];
            }
        }
        nonOverlappingIntervals.add(prev);

        return nonOverlappingIntervals.toArray(new int[0][]);
    }
}
