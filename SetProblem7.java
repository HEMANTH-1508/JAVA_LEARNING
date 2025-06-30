import java.util.*;

public class SetProblem7 {
    public static void main(String[] args){
        ArrayList<String> s=new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("a");
        s.add("d");

        Set<String> b=new HashSet<String>(s);

        System.out.println(b.size() == s.size() ? "unique" : "not unique");
    }
}
