public class UniqueBitwise {
    public static void main(String...args){
        int[] arr={2,3,4,5,4,3,2,6,8,6,8};
        int n=0;
        for(int num:arr){
            n=n^num;
        }
        System.out.println(n);
    }
}
