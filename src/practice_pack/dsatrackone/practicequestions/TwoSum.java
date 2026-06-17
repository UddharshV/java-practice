package practice_pack.dsatrackone.practicequestions;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //https://leetcode.com/problems/two-sum/description/
    //Date solved and submitted: June 16, 2026
    //Concepts learnt: Hashmaps and Arrays
    private static int[] solTwoSumBruteForce(int[] nums, int target) {
        /*
        Brute-Forced Approach:
        Take each element and check with all elements towards the right one by one to check if the criteria is met.
         */
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target)
                    return new int[] {i,j};
            }
        }
        return new int[] {-1,-1};
        //Time complexity: outer loop runs n-1 times, inner loop runs n-i-1 times each iteration: Total Time complexity: O(n^2)
        //Space complexity: O(1)
    }
    private static int[] solTwoSumOptimized(int[] nums, int target) {
        /*
        Use a hashmap:
        1. Check if an element is in hashmap: add it if not present
        2. Check if target-element is in the hashmap: if so, return the indices
         */
        HashMap<Integer, Integer> eleIndices = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(eleIndices.containsKey(target-nums[i]))
                return new int[] {eleIndices.get(target-nums[i]), i};
            //if(!eleIndices.containsKey(nums[i])) - not required as the duplicate key value is overwritten - exactly one solution is guaranteed
            eleIndices.put(nums[i], i);
        }
        return new int[] {-1, -1};
        //Time Complexity: Reduced to O(n) as there is only one loop involved to iterate over the input array elements
        //Space Complexity: O(n) due to the introduction of a hashmap, which stores all n elements and their indices if the criteria is never met
        /*Follow-Ups:
            1. Why Hashmap? Repeated fast lookups: O(1) time complexity
            2. Does the introduction of hashmap negatively affect the time complexity? No, containsKey() and get() are both O(1) average-case operations
            3. Why not use an ArrayList? Lookup speed: O(n) for contains and indexOf() -> Effectively makes the time complexity: O(n^2) - same as brute force with extra memory overhead and more complex code
                Also, the value -> index mappings cannot be expressed cleanly in an ArrayList -> no direct way to retrieve the index of a specific value
            4. Why not use a HashSet? HashSet can detect if a complement is present in it. However, we have no way to retrieve its original index to build the result array
         */
    }
    private static void displayResult(int[] indices){
        System.out.println(Arrays.toString(indices));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 3}; //Example: [2,7,11,15]
        int target = 6; //Example: 9
        int[] indices = solTwoSumOptimized(nums, target);
        displayResult(indices);
    }

}
