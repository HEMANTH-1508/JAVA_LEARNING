import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        int n;
        int osum = 0;
        int evensum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER SIZE OF ARRAY : ");
        n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("ENTER " + (i + 1) + " NUMBER : ");
            arr[i] = s.nextInt();
        }
        for (int num : arr) {
            if (num%2==0){
                evensum+=num;
            }
            else{
                osum+=num;
            }
        }
        System.out.print("EVEN SUM: "+evensum+"\nODD SUM : "+osum);
    }
}
