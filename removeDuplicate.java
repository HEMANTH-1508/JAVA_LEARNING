public class removeDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1,2,1,2,3,4,5,6,2,3,7,};
        int[] arr=new int[numbers.length];
        int b=0;

        for(int i=0;i<numbers.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<numbers.length;j++){
                if (i!=j && numbers[i]==numbers[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate){
                arr[b]=numbers[i];
                b++;
            }
        }
        for(int i=0;i<b;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
