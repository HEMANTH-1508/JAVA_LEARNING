import java.util.*;

public class SetProblem8 {
    public static void main(String[] args) {
        int[] nums={3, 1, 4, 2, 5, 3, 6, 1};
        Set<Integer> s=new HashSet<>();
        Integer d=null;
        for (int num : nums){
            if (s.contains(num)){
                d=num;
                break;
            }
            s.add(num);
        }
        if(d!=null){
            System.out.println("First repeating number: " + d);
        }else{
            System.out.println("No repeating numbers found.");
        }
    }
}