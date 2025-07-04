public class LengthofString {
    public static void main(String[] args){
        String s="hello people";
        int l=0;
        char[] c=s.toCharArray();
        for(int num:c){
            l++;
        }
        System.out.println(l);
    }
}
