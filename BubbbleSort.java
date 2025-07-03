public class BubbbleSort {
    public static void main(String[] args){
        int[] arr={23,5,2344,564,78,45,32,77,23,23,222,19,7};
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        for(int o:arr){
            System.out.print(o+" ");
        }
    }
}
