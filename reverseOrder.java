import java.util.*;

public class reverseOrder {
    int n;
    int[] arr;

    void getValues(){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER LENGTH OF ARRAY:");
        n=s.nextInt();
        arr=new int[n];
        for(int j=0;j<n;j++){
            System.out.print("ENTER "+(j+1)+" ELEMENT : ");
            arr[j]=s.nextInt();
        }
    }

    void revOrder() {
        for (int i=0; i<n/2; i++) {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println("ARRAY IN REVERSE ORDER:");
        for (int j=0; j<n; j++) {
            System.out.print(arr[j]+" ");
        }
    }

    public static void main(String[] args) {
        reverseOrder b=new reverseOrder();
        b.getValues();
        b.revOrder();
    }
}
