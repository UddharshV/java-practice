package practice_pack.basics;

public class BlockScope {
    public static void main(String[] args) {
        int a =10;
        System.out.println("a: " + a);
        {
            // int a = 20; - Throws an error as a is already initialized.
            a = 20; // changes the original variable a initialized outside this block's scope.
            System.out.println("a: " + a);
            int c = 30;
            System.out.println("c: " + c);
            int d = 40;
            System.out.println("d: " + d);
            int e = 50;
            System.out.println("e: " + e);
        }
        // e *= 2; - Throws an error as e's scope is limited to previous block and cannot be used here unless it is reinitialized.
        int d = 50;
        System.out.println("d: " + d);
    }
}
