import java.util.*;

public class SumofDigits {
    int a;

    void getValue(){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        a=s.nextInt();
    }
    void calculateSum() {
        int b=a;
        int c=0;
        while(b!=0){
            int digit=b%10;
            c+=digit;
            b/=10;
        }
        System.out.println("SUM OF DIGITS = " + c);
    }

    public static void main(String[] args) {
        SumofDigits obj = new SumofDigits();
        obj.getValue();
        obj.calculateSum();
    }
}