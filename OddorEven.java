import java.util.*;

public class OddorEven {

    int a;

    void getValue(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        a=s.nextInt();
    }

    void checkNumber(){
        if(a%2==0){
            System.out.println("NUMBER IS EVEN");
        }
        else{
            System.out.println("NUMBER IS ODD");
        }
    }

    public static void main(String[] args){
        OddorEven num=new OddorEven();
        num.getValue();
        num.checkNumber();
    }
}
