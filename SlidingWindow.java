import java.util.*;

public class SlidingWindow {
    public static void main(String...args){
        int[] a={2,8,6,10,3,7};
        int k=3;
        int max=0,min=Integer.MAX_VALUE;
        for(int i=0;i<a.length-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=a[j];
            }
            if(sum>max){
                max=sum;
            }
            if(sum<min){
                min=sum;
            }
        }
        System.out.print("Max : "+max+"\nMin : "+min);
    }
}
