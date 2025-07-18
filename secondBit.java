import java.util.NoSuchElementException;

public class secondBit {
    public static void main(String...args){
        int a=5;
        int p=3;//which position is required
        int c=1<<p;
        if((c&a)==0){
            System.out.println(c|a);
            System.out.println(Integer.toBinaryString(c|a));
        }else{
            System.out.println("1");
        }
    }
}
