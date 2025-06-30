import java.util.*;

public class SetProblem3 {
    public static void main(String[] args){
        Set<String> old=new HashSet<String>();
        old.add("a");
        old.add("b");
        old.add("c");
        old.add("d");
        old.add("e");
        old.add("f");

        Set<String> nestock=new HashSet<String>();
        nestock.add("c");
        nestock.add("a");
        nestock.add("g");
        nestock.add("y");
        nestock.add("w");
        nestock.add("t");


        nestock.addAll(old);
        System.out.println(nestock);
    }
}
