import java.util.*;

public class AmstrongNumber {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int n=s.nextInt();
        int rem,sum=0;
        int temp=n;
        int len=String.valueOf(n).length();
        while(temp!=0){
            rem=temp%10;
            sum+=Math.pow(rem, len);
            temp/=10;
        }
        if(sum==n)
        {System.out.println(n+" is an Armstrong number");
        }
        else{
            System.out.println(n+" is not an Armstrong number");
        }
    }
}
