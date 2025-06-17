class Shapee{
    void print(){
        System.out.println("THIS IS A SHAPE");
    }
}

class Rectanglebox extends Shapee{
    void print1(){
        System.out.println("THIS IS A Rectangle");
    }
}

class Circle extends  Shapee{
    void print2(){
        System.out.println("THIS IS A CIRCLE");
    }
}

class Square extends Rectanglebox{
    void print3(){
        System.out.println("SQUARE IS A RECTANGLE");
    }
}

public class Shape {
    public static void main(String[] args){
        Square s=new Square();
        s.print3();
        s.print1();
        s.print();
    }
}
