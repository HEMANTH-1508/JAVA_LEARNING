import java.util.*;

public class MissingElement {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:a){
            arr.add(num);
        }

        for(int i=0;i<n;i++){
            if(arr.contains(i)){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
