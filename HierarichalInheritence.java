class Cric {
    void play() {
        System.out.println("Playing Cricket");
    }
}

class First extends Cric {
    void bat() {
        System.out.println("First Innings: Batting");
    }
}

class SecondInnings extends Cric {
    void bowl() {
        System.out.println("Second Innings: Bowling");
    }
}

public class HierarichalInheritence {
    public static void main(String[] args) {
        First fi = new First();
        fi.play();
        fi.bat();
        System.out.println();
        SecondInnings si = new SecondInnings();
        si.play();
        si.bowl();
    }
}