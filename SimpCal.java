import java.util.Scanner;
public class SimpCal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a=s.nextDouble();
        System.out.print("Enter second number: ");
        double b=s.nextDouble();
        System.out.print("Enter operator (+, -, *, /, %): ");
        char op=s.next().charAt(0);
        switch (op){
            case '+':
                System.out.println("Result: "+(a+b));
                break;
            case '-':
                System.out.println("Result: "+(a-b));
                break;
            case '*':
                System.out.println("Result: "+(a*b));
                break;
            case '/':
                if (b!=0)
                    System.out.println("Result: "+(a/b));
                else
                    System.out.println("Error: Division by zero");
                break;
            case '%':
                System.out.println("Result: "+(a%b));
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}