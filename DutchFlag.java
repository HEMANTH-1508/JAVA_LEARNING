public class DutchFlag {
    public static void main(String... args){
        int[] arr={2, 0, 1, 0, 1, 2, 0};
        int l=0;
        int m=0;
        int r=arr.length-1;
        while(m<=r){
            if(arr[m]==0){
                int temp0=arr[l];
                arr[l]=arr[m];
                arr[m]=temp0;
                l++;
                m++;
            }else if(arr[m]==1){
                m++;
            }else if(arr[m]==2){
                int temp2=arr[m];
                arr[m]=arr[r];
                arr[r]=temp2;
                r--;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
