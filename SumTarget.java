import java.util.Scanner;

public class SumTarget {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("No of values: ");
        int a=s.nextInt();
        int[] arr=new int[a];
        System.out.print("Enter values : ");
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("ENTER SUM VALUE : ");
        int su=s.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<i;j++){
                int add=arr[i]+arr[j];
                if(add==su){
                    System.out.println(arr[i]+" - "+arr[j]);
                }
            }
        }
    }
}
