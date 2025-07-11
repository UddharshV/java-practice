package practice_pack.basics;

public class ShadowingExample {
    // Shadowing - Practice of using two variables with the same name within the scope that overlaps.
    static int x = 90;
    public static void main(String[] args) {
        int x = 9; // shadows the class variable
        System.out.println("x: " + x);
        display();
    }
    public static void display(){
        System.out.println("x: " + x);
    }

}
