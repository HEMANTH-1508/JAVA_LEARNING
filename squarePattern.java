import java.util.*;

public class squarePattern {
    int n;

    void getValue(){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        n=s.nextInt();
    }
    void printLoop(){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        squarePattern obj=new squarePattern();
        obj.getValue();
        obj.printLoop();
    }
}
