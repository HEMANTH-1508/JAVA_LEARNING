import java.util.*;

public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<String> t=new TreeSet<String>();
        t.add("one");
        t.add("two");
        t.add("three");
        t.add("four");
        t.add("five");
        System.out.println("Contents of treeset : ");
        Iterator it=t.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " - ");
        }
    }
}
