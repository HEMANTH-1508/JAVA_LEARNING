import java.util.*;

public class MaxandMin {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }

        for(int i=0;i<a;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("first max number : "+arr[a-1]+"\nsecond min number is : "+arr[1]);
    }
}
