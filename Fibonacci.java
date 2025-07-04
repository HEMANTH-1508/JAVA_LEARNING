import java.util.*;

public class Fibonacci{

    static int fib(int a){
        if(a<=1){
            return a;
        }
        return fib(a - 1)+fib(a - 2);
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER  NUMBER : ");
        int a=s.nextInt();
        System.out.print("Fibonacci Series: ");
        for (int i=0; i<a; i++){
            System.out.print(fib(i) + " ");
        }
    }
}
