import java.util.*;

public class HashSetExample {
    public static void main(String[] args){
        Set<Integer> t=new HashSet<Integer>();
        t.add(11);
        t.add(12);
        t.add(13);
        t.add(14);
        t.add(15);
        System.out.println("Contents of HashSet : ");
        for(Integer i:t){
            System.out.print(i+" ");
        }
    }
}
