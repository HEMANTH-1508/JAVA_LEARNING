import java.util.*;

public class LikedHashSet {
    public static void main(String[] args){
        LinkedHashSet<String> t=new LinkedHashSet<String>();
        t.add("one");
        t.add("two");
        t.add("three");
        t.add("four");
        t.add("five");
        System.out.println("Contents of LinkedHashSet : ");
        Iterator it=t.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
    }
}
