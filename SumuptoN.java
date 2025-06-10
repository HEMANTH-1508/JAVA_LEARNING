import java.util.Scanner;

public class SumuptoN {
    int n;
    int su=0;

    void getValue(){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        n=s.nextInt();
    }
    void sumLoop(){
        for(int i=0;i<=n;i++){
            su+=i;
        }
        System.out.println("SUM UP TO N NUMBERS IS : "+su);
    }
    void sumform(){
        int summm=(n*(n+1))/2;
        System.out.println("SUM USING FORMULAE : "+summm);
    }

    public static void main(String[] args){
        SumuptoN obj=new SumuptoN();
        obj.getValue();
        obj.sumLoop();
        obj.sumform();
    }
}
