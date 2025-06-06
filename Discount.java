import java.util.*;

public class Discount {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT : ");
        double a=s.nextInt();
        if(a>=1000){
            System.out.println("AMOUNT AFTER DISCOUNT : "+(a-(a*0.10)));
        }
        else{
            System.out.println("PURCHASE ITEMS OF WORTH 1000 OR ABOVE TO GET DISCOUNT");
        }
    }
}
