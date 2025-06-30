import java.util.*;

public class MapExample {
    public static void main(String[] args){
        HashMap<String,Double> h=new HashMap<String,Double>();
        h.put("a",32.482);
        h.put("b",92.4833);
        h.put("c",-32.3448);
        h.put("d",562.458);
        h.put("e",3452.4834);

        Set s=h.entrySet();

        Iterator i=s.iterator();

        while(i.hasNext()) {
            Map.Entry e=(Map.Entry)i.next();
            System.out.println(e.getKey() + ": " + e.getValue());
        }


        double b=((Double)h.get("a")).doubleValue();
    }
}
