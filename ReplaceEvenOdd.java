import java.util.Scanner;

public class ReplaceEvenOdd {
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER SIZE OF ARRAY : ");
        n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("ENTER "+(i+1)+" NUMBER : ");
            arr[i]=s.nextInt();
        }
        for (int num:arr) {
            System.out.print((num%2==0 ? 0:1)+" ");
        }
    }
}
