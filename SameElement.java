import java.util.*;

import static java.lang.reflect.Array.set;

public class SameElement {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int[] a1=new int[n1];
        for(int i=0;i<n1;i++){
            a1[i]=s.nextInt();
        }

        int n2=s.nextInt();
        int[] a2=new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=s.nextInt();
        }

        int n3=s.nextInt();
        int[] a3=new int[n3];
        for(int i=0;i<n3;i++){
            a3[i]=s.nextInt();
        }

        ArrayList<Integer> s1=new ArrayList<>();
        for(int num:a1){
            s1.add(num);
        }

        ArrayList<Integer> s2=new ArrayList<>();
        for(int num:a2){
            if(s1.contains(num)){
                s2.add(num);
            }
        }

        ArrayList<Integer> s3=new ArrayList<>();
        for(int num:a3){
            if(s2.contains(num)){
                s3.add(num);
            }
        }

        System.out.print(s3);
    }
}
