import java.util.*;

public class Table {

    int a;

    void getValue(){
        Scanner s= new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        a=s.nextInt();
    }

    void printTable(){
        for(int i=0; i<=10;i++){
            System.out.println(a+" X "+i+" = "+(a*i));
        }
    }

    public static void main(String[] args){
        Table num=new Table();
        num.getValue();
        num.printTable();
    }
}
