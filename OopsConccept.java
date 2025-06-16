import java.util.*;

class Form{
    String name;
    int age,id;

    Form(String s, int a, int i){
        name=s;
        age=a;
        id=i;
    }
    //Form(){} //non parameterized

    void printInfo(){
        System.out.print(name+"\n"+age+"\n"+id);
    }
}



public class OopsConccept {
    public static void main(String[] args){
        Form s = new Form("hemanth",20,1508);
        s.printInfo();
    }
}