import java.util.*;
public class ZerotoEnd {
    int c;
    char[] arr;
    void getValues() {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER LENGTH OF ARRAY:");
        c=s.nextInt();
        arr=new char[c];
        for(int j=0;j<c;j++) {
            System.out.print("ENTER "+(j+1)+" ELEMENT : ");
            arr[j]=s.next().charAt(0);
        }
    }

    void arrangeArray() {
        Arrays.sort(arr);
    }

    void printArray() {
        for(char ch : arr) {
            if(Character.isLetter(ch)) {
                System.out.print(ch+" ");
            }
        }
        for(char ch : arr) {
            if(!Character.isLetter(ch)) {
                System.out.print(ch+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ZerotoEnd o=new ZerotoEnd();
        o.getValues();
        o.arrangeArray();
        o.printArray();
    }
}