import java.util.Scanner;

public class Temp {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER TEMPERATURE : ");
        int a=s.nextInt();
        if(a>30){
            System.out.println("ITS TOO HOT! ");
        }
        else if(a<15){
            System.out.println("WEAR A JACKET");
        }
        else{
            System.out.println("WEATHER IS PLEASANT");
        }
    }
}
