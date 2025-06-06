import java.util.*;

public class Factor0f10 {
    int a;

    void getValue(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        a=s.nextInt();
    }

    void checkNumber(){
        if(10%a==0){
            System.out.println("NUMBER IS FACTOR OF 10");
        }
        else{
            System.out.println("NUMBER IS NOT FACTOR OF 10");
        }
    }

    public static void main(String[] args){
        Factor0f10 num=new Factor0f10();
        num.getValue();
        num.checkNumber();
    }
}

