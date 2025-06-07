import java.util.Scanner;

public class CricScore {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER SCORE : ");
        int a=s.nextInt();
        if(a>=200){
            System.out.println("Awesome Innings");
        }
        else if(a==100){
            System.out.println("Good Innings");
        }
        else{
            System.out.println("need improvement");
        }
    }
}
