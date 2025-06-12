import java.util.*;

public class ArrayPrinting {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("No of values: ");
        int a=s.nextInt();
        int[] arr=new int[a];
        System.out.print("Enter values: ");
        for(int i=0; i<a; i++){
            arr[i]=s.nextInt();
        }
        System.out.print("No of Rotations : ");
        int n=s.nextInt();

        while(n!=0){
            int first=arr[0];
            for (int i=0; i<a-1; i++){
                arr[i]=arr[i+1];
            }
            arr[a-1]=first;
            n--;
        }

        System.out.println("Array after left rotation: ");
        for(int i=0; i<a; i++){
            System.out.print(arr[i]+" ");
        }
    }
}