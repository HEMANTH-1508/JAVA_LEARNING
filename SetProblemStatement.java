import java.util.*;

public class SetProblemStatement {
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(1);
        a.add(3);
        a.add(1);
        a.add(3);
        a.add(5);
        System.out.println("Contents of Array List  : "+a);

        Set<Integer> t=new HashSet<Integer>();
        for(Integer i:a){
            t.add(i);
        }
        System.out.println("Contents of Hash Set : "+t+"\nLength of set : "+t.size());
    }
}
