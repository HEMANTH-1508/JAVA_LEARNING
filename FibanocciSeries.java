import java.util.*;

public class FibanocciSeries {
    int a=0,b=1;

    void FiboSeries(int n){
        System.out.print("Fibonacci Series: ");
        if(n>=1){
            System.out.print(a+" ");
        }
        if(n>=2){
            System.out.print(b+" ");
        }
        int i=2;
        while(i<n){
            int next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
            i++;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER n VALUE  : ");
        int n=s.nextInt();
        FibanocciSeries obj=new FibanocciSeries();
        obj.FiboSeries(n);
    }
}
