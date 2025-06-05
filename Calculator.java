import java.util.*;

public class Calculator {
    double[] numbers;
    int n;

    void getValues(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter how many numbers you want to calculate: ");
        n = s.nextInt();
        numbers=new double[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter number "+(i+1)+": ");
            numbers[i] = s.nextDouble();
        }
    }

    void showMenu() {
        System.out.println("\nChoose operation to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulos");
        System.out.print("Enter your choice (1-5): ");
    }

    void performOperation(int choice){
        double result = 0;

        switch(choice){
            case 1:
                result=0;
                for(double num : numbers) {
                    result += num;
                }
                System.out.println("Sum = "+result);
                break;

            case 2:
                result=numbers[0];
                for(int i=1;i<n;i++) {
                    result -= numbers[i];
                }
                System.out.println("Subtraction Result = "+result);
                break;

            case 3:
                result=1;
                for(double num : numbers){
                    result*=num;
                    }
                System.out.println("Multiplication Result = "+result);
                break;

            case 4:
                result=numbers[0];
                boolean valid=true;
                for (int i=1;i<n;i++){
                    if(numbers[i]==0){
                        System.out.println("Error: Division by zero is not allowed.");
                        valid=false;
                        break;
                    }
                    result/=numbers[i];
                }
                if(valid)
                    System.out.println("Division Result = "+result);
                break;
            case 5:
                result=numbers[0];
                for (int i=1;i<n;i++){
                    result %=numbers[i];
                }
                System.out.println("Division Result = "+result);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.getValues();
        calc.showMenu();
        Scanner s=new Scanner(System.in);
        int choice=s.nextInt();
        calc.performOperation(choice);
    }
}