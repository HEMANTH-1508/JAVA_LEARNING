import java.util.Scanner;

public class sumArray {
    int c;
    int sum=0;
    int sum2=0;
    int[] arr;

    void getValues(){
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER LENGTH OF ARRAY:");
        c = s.nextInt();
        arr=new int[c];
        for(int j=0;j<c;j++){
            System.out.print("ENTER "+(j+1)+" ELEMENT : ");
            arr[j]=s.nextInt();
        }
    }

    void sumofTheValues(){
        for(int i=0;i<c;i++){
            sum+=arr[i];
        }
        System.out.print("SUM OF ELEMENTS IN ARRAY IS : "+sum);
    }

    void enhance(){
        for(int num:arr){
            sum2+=num;
        }
        System.out.print(sum2);
    }

    public static void main(String[] args) {
        sumArray b=new sumArray();
        b.getValues();
        //b.sumofTheValues();
        b.enhance();
    }
}
