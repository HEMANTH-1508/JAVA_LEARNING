import java.util.*;

public class AssignAlphabet {
    public static void main(String[] args){
        char c='H';
        int n=20;
        if((c>='a' && c<='z')){
            char ch=(char)('a'+(c+n-'a')%26);
            System.out.println(ch);
        }
        if(c>='A' && c<='Z'){
            char ch=(char)('A'+(c+n-'A')%26);
            System.out.println(ch);
        }
    }
}
