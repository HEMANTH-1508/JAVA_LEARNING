import java.util.*;

public class forLoop {
    int n;

    void getValue(){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        n=s.nextInt();
    }
    void printLoop(){
        for(int i=0;i<=n;i++){
            System.out.print(i+"\t");
        }
    }

    public static void main(String[] args){
        forLoop obj=new forLoop();
        obj.getValue();
        obj.printLoop();
    }
}
