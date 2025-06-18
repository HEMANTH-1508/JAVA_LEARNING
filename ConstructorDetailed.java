import java.util.*;

class Forms {
    Forms() {
        System.out.println("NON PARAMETERIZED CONSTRUCTOR");
    }

    Forms(String name) {
        System.out.println("PARAMETERIZED CONSTRUCTOR" + name);
    }
}


public class ConstructorDetailed {
    public static void main(String[] args) {
        new Forms();
        new Forms("HEMANTH");
    }
}