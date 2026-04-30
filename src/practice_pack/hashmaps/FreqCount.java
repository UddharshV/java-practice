package practice_pack.hashmaps;

import java.util.HashMap;

public class FreqCount {
    public static void main(String[] args) {
        String[] inputString = {"apple", "banana", "apple", "cherry", "banana", "apple"};
        performOp(inputString);
    }
    public static void performOp(String[] inputString){
        HashMap <String,Integer> freqCounter = new HashMap<>();
        for(String str: inputString)
            freqCounter.put(str,freqCounter.getOrDefault(str,0)+1);
        System.out.println(freqCounter);
    }
}
