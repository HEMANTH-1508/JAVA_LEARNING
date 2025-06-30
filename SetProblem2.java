import java.util.*;

public class SetProblem2 {
    public static void main(String[] args) {
        List<String> A = Arrays.asList("a", "b", "c", "d");
        List<String> B = Arrays.asList("e", "b", "c", "f");
        Set<String> setA = new LinkedHashSet<>(A);
        Set<String> setB = new LinkedHashSet<>(B);
        setA.retainAll(setB);
        System.out.println("Common students in both batches: " + setA);
    }
}