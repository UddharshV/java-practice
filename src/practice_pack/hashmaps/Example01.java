package practice_pack.hashmaps;

import java.util.HashMap;

public class Example01 {
    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("orange", 2);
        map.put("apple", 6);

        System.out.println(map.get("berry"));
    }
}
