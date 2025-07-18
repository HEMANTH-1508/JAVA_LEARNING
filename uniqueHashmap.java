import java.util.HashMap;
import java.util.Iterator;

public class uniqueHashmap {
    public static void main(String...args){
        int[] arr={2,3,4,5,4,3,2,6,8,6,8};
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int num:arr){
            m.put(num,  m.getOrDefault(num,0)+1);
        }
        System.out.println("Unique values are:");
        for(int key : m.keySet()){
            if(m.get(key) == 1){
                System.out.println(key);
            }
        }
    }
}
