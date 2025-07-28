import java.util.HashMap;
import java.util.Scanner;

public class firstNonRepeating {
    public static void main(String...args){
        Scanner s=new Scanner(System.in);
        String in=s.nextLine().toLowerCase();
        char[] ch=in.toCharArray();
        HashMap<Character, Integer> m=new HashMap<>();
        for(char cc:ch){
            if(cc>='a' && cc<='z'){
                m.put(cc, m.getOrDefault(cc, 0) + 1);
            }
        }
        for(char cc:ch){
            if(cc>='a' && cc<='z' && m.get(cc)==1){
                System.out.println(cc);
                break;
            }
        }
    }
}
