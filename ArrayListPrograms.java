import java.util.*;

public class ArrayListPrograms {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        ArrayList<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        System.out.println(names);
        names.add(0, "Start");
        System.out.println(names);
        names.add("End");
        System.out.println(names);
        names.set(1, "Update");
        System.out.println(names);
    }
}
