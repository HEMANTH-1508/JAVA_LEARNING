import java.util.LinkedList;

public class LinkedListProgram{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("Original: " + list);
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        list.removeFirst();
        System.out.println("Updated List: " + list);
    }
}