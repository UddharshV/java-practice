package practice_pack.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindOddNumbers {
    public static void main(String[] args) {
        int[] inpArray = {1,2,3,4,5,6};
        performOp(inpArray);
        performOp2(inpArray);
    }
    public static void performOp(int[] inpArray){
        List<Integer> inpList = new ArrayList<>();
        for(int number: inpArray)
            if(number%2!=0)
                inpList.add(number);
        System.out.println(inpList);
    }
    public static void performOp2(int[] inpArray){
        List<Integer> inpList = new ArrayList<>();
        for(int number: inpArray)
                inpList.add(number);

//        Iterator <Integer> iterator = inpList.iterator();
//        while(iterator.hasNext()){
//            if(iterator.next()%2==0)
//                iterator.remove();
//        }


        for(int i=inpList.size()-1; i>=0; i--)
            if(inpList.get(i)%2 == 0)
                inpList.remove(i);

        System.out.println(inpList);
    }
}
