import java.util.Scanner;

public class PowerRec {

    static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        return a*pow(a,b-1);
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER  BASE NUMBER : ");
        int a=s.nextInt();
        System.out.print("ENTER  POWER NUMBER : ");
        int b=s.nextInt();
        System.out.print("SUM OF DIGITS : "+pow(a,b));
    }
}
