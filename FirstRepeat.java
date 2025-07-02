import java.util.*;

public class FirstRepeat {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }

        ArrayList<Integer> si = new ArrayList<>();
        for (int i=0; i<n; i++) {
            if (si.contains(a[i])) {
                System.out.println(a[i]);
                break;
            } else {
                si.add(a[i]);
            }
        }
    }
}
