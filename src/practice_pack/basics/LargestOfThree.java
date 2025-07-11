package practice_pack.basics;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        if(a>b){
//            if(a>c){
//                System.out.println(a  + " is the largest given number.");
//            }
//            else{
//                System.out.println(c  + " is the largest given number.");
//            }
//        }
//        else{
//            if(b>c){
//                System.out.println(b  + " is the largest given number.");
//            }
//            else{
//                System.out.println(c  + " is the largest given number.");
//            }
//        }
//        int max = a;
//        if(b>max)
//            max = b;
//        if(c>max)
//            max = c;
        int max = Math.max(c, Math.max(a,b));
        System.out.println("The largest of the three given numbers is: " + max);
    }
}
