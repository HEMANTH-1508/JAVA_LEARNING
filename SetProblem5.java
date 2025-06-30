import java.util.*;

public class SetProblem5 {
    public static void main(String[] args){
        Set<String> A=new HashSet<String>();
        A.add("a");
        A.add("b");
        A.add("c");
        A.add("d");
        A.add("e");
        A.add("f");

        Set<String> B=new HashSet<String>();
        B.add("a");
        B.add("f");
        B.add("d");

        System.out.println(A.containsAll(B));
    }
}
