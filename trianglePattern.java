import java.util.*;

public class trianglePattern {
    int n;

    void getValue(){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        n=s.nextInt();
    }
    void printLoop(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        trianglePattern obj=new trianglePattern();
        obj.getValue();
        obj.printLoop();
    }
}
