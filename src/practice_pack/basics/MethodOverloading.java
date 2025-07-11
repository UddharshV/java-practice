package practice_pack.basics;

import java.util.Arrays;

public class MethodOverloading {
    // Methods with the same name but different number or type of parameters passed in its signatures.
    public static void main(String[] args) {
        display(10);
        display("Uddharsh Vasili");
        //variable arguments - vargs
        //Method Overloading for methods with variable arguments - Methods cannot have zero parameters! -> Ambiguity.
        perform(1,2,3,4,5);
        perform(); // vargs - 0 or more parameters can be passed
        perform2(10,20,"Uddharsh");
    }
    static void display(int num){
        System.out.println("number: " + num);
    }
    static void display(String name){
        System.out.println("name: " + name);
    }
    static void perform(int ...nums){
        System.out.println(Arrays.toString(nums));
    }
    static void perform2(int num1, int num2, String ...names){
        //vargs - always towards the end in a method signature.
        System.out.println("num1: " + num1 + " num2: "+ num2);
        System.out.println(Arrays.toString(names));
    }
}
