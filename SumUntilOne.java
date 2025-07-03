import java.util.*;

public class SumUntilOne {

    void sumOfNum(int a){
        while(a>=10){
            int sum=0;
            while(a>0){
                int n=a%10;
                sum+=n;
                a=a/10;
            }
            a=sum;
        }
        System.out.println(a);
    }

    public static void main(String[] args){
        SumUntilOne obj=new SumUntilOne();
        obj.sumOfNum(9875);
    }
}
