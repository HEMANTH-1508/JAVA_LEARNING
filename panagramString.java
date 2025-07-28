import java.util.Scanner;
import java.util.HashSet;

public class panagramString {
    public static void main(String...args){
        Scanner s= new Scanner(System.in);
        String in=s.nextLine();
        String inn=in.toLowerCase();
        char[] c=inn.toCharArray();
        HashSet<Character> t=new HashSet<Character>();
        for(char charetor:c){
            if(charetor>='a' && charetor<='z'){
                t.add(charetor);
            }
        }
        if(t.size()==26){
            System.out.print("panagram");
        }else{
            System.out.println("not panagram");
            System.out.println(t.size());
            System.out.println(t);
        }
    }
}
