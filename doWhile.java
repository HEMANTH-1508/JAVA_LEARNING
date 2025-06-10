import java.util.Scanner;

public class doWhile {
    public static void main(String[] args){
        int a,i;
        i=1;
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        a=s.nextInt();
        do{
            System.out.print(i);
            i++;
        }
        while(i<=a);
    }
}