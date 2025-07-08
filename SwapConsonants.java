public class SwapConsonants {
    public static void main(String[] args){
        String n="hello world";
        String rev="";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='a' || n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u'){
                rev+=n.charAt(i);
            }
            else{
                rev=n.charAt(i)+rev;
            }
        }
        System.out.println(rev);
    }
}
