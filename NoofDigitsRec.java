import java.util.*;

public class NoofDigitsRec{

    static int digi(int a){
        if(a==0){
            return 0;
        }
        return 1+digi(a/10);
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER  NUMBER : ");
        int a=s.nextInt();
        System.out.print("NO OF DIGITS : "+digi(a));
    }
}
