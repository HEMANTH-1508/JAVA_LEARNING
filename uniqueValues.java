import java.util.Scanner;

public class uniqueValues {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("No of values: ");
        int a=s.nextInt();
        int[] arr=new int[a];

        System.out.print("Enter values : ");
        int max=0;
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] frequency=new int[max+1];
        for(int num : arr){
            frequency[num]++;
        }
        System.out.println("UNIQUE VALUES IS/ARE : ");
        for(int num : arr){
            if(frequency[num]==1){
                System.out.println(num+" ");
            }
        }
    }
}
