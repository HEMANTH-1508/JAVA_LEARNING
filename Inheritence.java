import java.util.*;

class Cricket{
    void crc(){
        System.out.println("Playing Cricket");
    }
}

class FirstInnings extends Cricket{
    void Bat(){
        System.out.println("First Innings: Batting");
    }
}


class FinalOver extends FirstInnings{
    void finalover(){
        System.out.println("First Over Starts ");
    }
}

public class Inheritence {

    public static void main(String[] args){
        FinalOver f=new FinalOver();
        f.crc();
        f.Bat();
        f.finalover();
    }

}
