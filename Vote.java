import java.util.*;

public class Vote {
    int age;

    void getAge(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER AGE : ");
        age=s.nextInt();
    }

    void checkAge(){
        if(age<0){
            System.out.println("ENTER VALID AGE.");
        }
        else if(age>=18){
            System.out.println("YOU ARE ELIGIBLE TO VOTE.");
        }
        else{
            System.out.println("YOU ARE NOT ELIGIBLE TO VOTE.");
        }
    }

    public static void main(String[] args){
        Vote age=new Vote();
        age.getAge();
        age.checkAge();
    }
}
