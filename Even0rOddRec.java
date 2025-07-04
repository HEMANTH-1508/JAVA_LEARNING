import java.util.*;

public class Even0rOddRec {

    static  String check(int a){
        String arr[]={"EVEN", "ODD"};
        return arr[a%2];
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER  NUMBER : ");
        int a=s.nextInt();
        System.out.print("NUMBER IS : "+check(a));

    }
}
