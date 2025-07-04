import java.util.*;

public class Factorial{
    int fac(int a){
        if(a==1){
            return 1;
        }
        return a*fac(a-1);
    }

    public static void main(String[] args){
        Factorial r=new Factorial();
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER  NUMBER : ");
        int a=s.nextInt();
        System.out.print(r.fac(a));
    }
}
