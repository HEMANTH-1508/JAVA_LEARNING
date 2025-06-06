import java.util.*;

public class Greetings {
    int a;

    void getValue(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Hour : ");
        a=s.nextInt();
    }

    void Greet(){
        if(a>0 && a<12){
            System.out.println("GOOD MORNING!");
        }
        else if (a>=12 && a<17){
            System.out.println("GOOD AFTERNOON!");
        }
        else if(a>=17 && a<=23){
            System.out.println("GOOD EVENING!");
        }
        else{
            System.out.println("ENTER VALID TIME!");
        }
    }

    public static void main(String[] args){
        Greetings g=new Greetings();
        g.getValue();
        g.Greet();
    }
}
