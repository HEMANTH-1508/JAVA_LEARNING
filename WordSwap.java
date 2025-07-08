public class WordSwap {
    public static void main(String[] args){
        String n="he is a skipper";
        int l=n.length();
        String ss="";
        String[] words=n.split(" ");
        for(String s:words){
            ss=s+" "+ss;
        }
        System.out.println(ss);
    }
}
