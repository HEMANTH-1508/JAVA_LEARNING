public class EvenLengthWord {
    public static void main(String[] args){
        String n="he is a skipper";
        int l=n.length();
        String[] words=n.split(" ");
        for(String s:words){
            if(s.length()%2==0){
                System.out.print(s+" ");
            }
        }
    }
}
