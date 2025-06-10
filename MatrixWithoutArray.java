import java.util.Scanner;

public class MatrixWithoutArray {
    int n;
    int num1=1;
    int num2=1;
    int a=0;

    void getValue(){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        n=s.nextInt();
    }
    void printLoop(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(num1);
                num1++;
            }
            System.out.println();
        }
    }
    void printloop2(){
        while(a<n){
            int j=0;
            while(j<n){
                System.out.print(num2);
                num2++;
                j++;
            }
            System.out.println();
            a++;
        }
    }

    public static void main(String[] args){
        MatrixWithoutArray obj=new MatrixWithoutArray();
        obj.getValue();
        //obj.printLoop();
        obj.printloop2();
    }
}
