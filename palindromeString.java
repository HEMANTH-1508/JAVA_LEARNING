import java.util.Scanner;

public class palindromeString {
    public static void main(String...args){
        Scanner a=new Scanner(System.in);
        String s=a.next();
        String r=new StringBuilder(s).reverse().toString();
        if(s.equals(r)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
