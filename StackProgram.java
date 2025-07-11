import java.util.Stack;

public class StackProgram {
    public static void main(String[] args){
        Stack<Integer> s=new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.err.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.empty());
        s.add(3,6);
        System.out.println(s);
        System.out.println(s.isEmpty());
    }
}
