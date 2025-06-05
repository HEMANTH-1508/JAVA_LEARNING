import java.util.*;

public class Arithmetic {
    int c, d;

    void getValues() {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER 1st NUMBER:");
        c = s.nextInt();
        System.out.println("ENTER 2nd NUMBER:");
        d = s.nextInt();
    }

    void sumOfNumbers() {
        System.out.println("SUM IS: " + (c + d));
    }

    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        a.getValues();
        a.sumOfNumbers();
    }
}