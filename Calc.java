import java.util.*;

public class Calc {
    int a,b;

    void getValues(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a and b values : ");
        a=s.nextInt();
        b=s.nextInt();
    }

    void showMenu(){
        System.out.println("\nChoose operation to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Mod");
        System.out.print("Enter your choice (1-5): ");
    }

    void Operation(int c){
        int result = 0;
        switch(c){
            case 1:
                result=a+b;
                System.out.println("Sum = "+result);
                break;

            case 2:
                result=a-b;
                System.out.println("Subtraction = "+result);
                break;

            case 3:
                result=a*b;
                System.out.println("Multiplication = "+result);
                break;

            case 4:
                boolean valid=true;
                if(b==0){
                    System.out.println("Error: Division by zero is not allowed.");
                    valid=false;
                    break;
                }
                if(valid)
                    result=a/b;
                    System.out.println("Division = "+result);
                break;
            case 5:
                result=a%b;
                System.out.println("Mod = "+result);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args){
        Calc obj=new Calc();
        obj.getValues();
        obj.showMenu();
        Scanner s=new Scanner(System.in);
        int c=s.nextInt();
        obj.Operation(c);
    }
}
