import java.util.Arrays;

public class ArraytoString {
    public static void main(String[] args){
        int[] arr={1,4,5,2,3,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));
        int[] arr2={1,4,5,2,3,1};
        System.out.println(Arrays.equals(arr, arr2));
        int[] copy= Arrays.copyOf(arr2, 10);
        System.out.println(Arrays.toString(copy));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        int a=Arrays.binarySearch(arr2, 3);
        System.out.println(a);
        int[] copyrange=Arrays.copyOfRange(arr2,0, 3);
        System.out.println(Arrays.toString(copyrange));
        System.out.println(copyrange.length);
    }
}
