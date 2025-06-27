import java.util.*;

public class RversedLinkedList {
    void reverse(LinkedList<String> list){
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            String temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        RversedLinkedList rev = new RversedLinkedList();
        LinkedList<String> list = new LinkedList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("Original: " + list);
        rev.reverse(list);
        System.out.println("Updated: " + list);
    }
}
