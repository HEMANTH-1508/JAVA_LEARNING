import java.util.LinkedList;
import java.util.Scanner;

public class LInkedListUser {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        Scanner s=new Scanner(System.in);
        String i;

        System.out.println("Enter values to add to the list (type 'exit' to finish):");
        while (true) {
            i=s.nextLine();
            if (i.equalsIgnoreCase("exit")) {
                break;
            }
            list.add(i);
        }
        System.out.println("Original: " + list);
    }
}
