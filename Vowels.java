public class Vowels {
    public static void main(String[] args){
        String n="java";
        int v=0,c=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='a' || n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u'){
                v+=1;
            }else{
                c+=1;
            }
        }
        System.out.println("vowels : "+v+"\nConsonants: "+c);
    }
}
