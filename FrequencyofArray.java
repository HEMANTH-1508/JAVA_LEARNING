import java.util.*;

public class FrequencyofArray {
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
        System.out.println("Frequency of each element:");
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>0){
                System.out.println(i + " -- " +frequency[i]);
            }
        }
    }
}