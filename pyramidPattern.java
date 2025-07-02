import java.util.*;

public class pyramidPattern {
    int n;

    void getValue(){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        n=s.nextInt();
    }
    void printLoop(){
        for (int i=1;i<n;i++){
            for (int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void printLoop2() {
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n+i-1;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pyramidPattern obj=new pyramidPattern();
        obj.getValue();
        obj.printLoop();
        obj.printLoop2();
    }
}
