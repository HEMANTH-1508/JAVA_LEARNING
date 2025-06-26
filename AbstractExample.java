abstract class Animal {
    abstract void sound();
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.sound();
        a1.sleep();
        Animal a2 = new Cat();
        a2.sound();
        a2.sleep();
    }
}