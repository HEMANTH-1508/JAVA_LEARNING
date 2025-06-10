import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        int a,i;
        i=1;
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        a=s.nextInt();
        while(i<=a){
            System.out.print(i);
            i++;
        }
    }
}
