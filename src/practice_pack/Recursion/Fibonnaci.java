package practice_pack.Recursion;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    public static int fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonacci(n-2)+fibonacci(n-1);
    }
}
