import java.util.Scanner;

public class countofEachCharector {
    public static void main(String...args){
        Scanner s= new Scanner(System.in);
        String in=s.nextLine().toLowerCase();
        char[] c=in.toCharArray();
        int[] freq=new int[26];
        for(char charector:c){
            if(charector>='a' && charector<='z'){
                freq[charector-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                System.out.println((char)(i+'a')+"-->"+freq[i]);
            }
        }
    }
}
