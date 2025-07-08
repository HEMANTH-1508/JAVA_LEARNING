public class SwapTwo {
    public static void main(String[]args){
        String s="viking";
        char[] c=s.toCharArray();
        for(int i=0;i<s.length()-1;i+=2){
            char temp=c[i];
            c[i]=c[i+1];
            c[i+1]=temp;
        }
        System.out.println(c);
    }
}
