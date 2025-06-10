import java.util.Scanner;

public class ArrayInput {

    int c;
    int[] arr;

    void getValues() {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER LENGTH OF ARRAY:");
        c = s.nextInt();
        arr=new int[c];
        for(int j=0;j<c;j++){
            System.out.print("ENTER "+(j+1)+" ELEMENT : ");
            arr[j]=s.nextInt();
        }
    }

    void printValues(){
        for(int i=0;i<c;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        ArrayInput ob=new ArrayInput();
        ob.getValues();
        ob.printValues();
    }
}
