import java.util.Scanner;

public class NegativetoFirst {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("No of values: ");
        int a=s.nextInt();
        int[] arr=new int[a];
        System.out.print("Enter values : ");
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
