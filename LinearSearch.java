public class LinearSearch {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,23,12,11,8,423,6786,123,34,234,787,34,56,345,67,23,45,8};
        int f=23;
        for(int i=0;i<a.length;i++){
            if(a[i]==f){
                System.out.println("element found at : "+i);
            }
        }
    }
}
