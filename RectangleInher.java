import java.util.*;


class Area{
    int length, breadth;
    Area(int l, int b){
        length=l;
        breadth=b;
        int a=returnArea();
        System.out.println(a);
    }
    int returnArea(){
        return length*breadth;
    }
}

public class RectangleInher{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER LENGTH AND BREADTH : ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        Area r=new Area(l, b);
    }
}