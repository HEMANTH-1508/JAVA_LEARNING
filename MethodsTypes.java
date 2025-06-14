public class MethodsTypes {

    void fun(){  // no return type - no parameters
        System.out.println("hello world");
    }
    void fun(String name){     // no return type with parameters
        System.out.println(name + " is  a program");
    }
    // method overloading - same  method name with same parameters
    int add(int a, int b){
        return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
    int add(int a, int b , int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodsTypes f=new MethodsTypes();
        f.fun();
        f.fun("java");
        System.out.println(f.add(3,4));
        System.out.println(f.add(3.0f,4.0f));
        System.out.println(f.add(3,4, 6));
    }
}

