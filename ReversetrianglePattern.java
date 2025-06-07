import java.awt.desktop.PreferencesEvent;
import java.util.*;

public class ReversetrianglePattern {
    int n;

    void getValue(){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        n=s.nextInt();
    }
    void printLoop(){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        ReversetrianglePattern obj=new ReversetrianglePattern();
        obj.getValue();
        obj.printLoop();
    }
}
