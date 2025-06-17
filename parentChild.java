import org.w3c.dom.ls.LSOutput;

class Parent{
    void parent(){
        System.out.println("THIS IS A PARENT CLASS");
    }
}

class Child1 extends Parent{
    void child1(){
        System.out.println("THIS IS CHILD 1 CLASS");
    }
}

class Child2 extends Parent{
    void child2(){
        System.out.println("THIS IS CHILD 2 CLASS");
    }
}

class Subchild extends Child1{
    void subchild(){
        System.out.println("THIS IS CHILD 1 CLASS");
    }
}


public class parentChild {
    public static void main(String[] args){
        Parent p=new Parent();
        p.parent();

        Child1 c1=new Child1();
        c1.child1();
        c1.parent();

        Child2 c2=new Child2();
        c2.child2();
        c2.parent();

        Subchild sc=new Subchild();
        sc.subchild();
        sc.child1();
        sc.parent();
    }
}
