public class SelectionSort {
    public static void main(String[] args){
        int[] arr={23,5,2344,564,78,45,32,77,23,23,222,19,7};
        for (int i=0; i<arr.length-1; i++){
            int m=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[m]){
                    m=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[m];
            arr[m]=temp;
        }
        for(int o:arr){
            System.out.print(o+" ");
        }
    }
}
