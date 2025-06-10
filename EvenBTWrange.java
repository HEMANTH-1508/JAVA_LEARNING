import java.util.*;

public class EvenBTWrange {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER START NUMBER : ");
        int a=s.nextInt();
        System.out.print("ENTER END NUMBER : ");
        int b=s.nextInt();

        for(int j=a;j<=b;j++){
            if(j%2==0){
                System.out.print(j+" ");
            }
        }
    }
}
