import java.util.*;

public class Grade {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER MARKS : ");
        int a=s.nextInt();
        if(a>=90 && a<=100){
            System.out.println("A GRADE");
        }
        else if(a>=75 && a<90){
            System.out.println("B GRADE");
        }
        else if(a>=60 && a<75){
            System.out.println("c GRADE");
        }
        else{
            System.out.println("FAIL GRADE");
        }
    }
}
