import java.util.*;

public class SetProblem4 {
    public static void main(String[] args){
        Set<String> current=new HashSet<String>();
        current.add("a");
        current.add("b");
        current.add("c");
        current.add("d");
        current.add("e");
        current.add("f");

        Set<String> resign=new HashSet<String>();
        resign.add("a");
        resign.add("f");
        resign.add("d");

        current.removeAll(resign);

        System.out.println(current);
    }
}
