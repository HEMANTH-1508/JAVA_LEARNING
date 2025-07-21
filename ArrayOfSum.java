public class ArrayOfSum {
    public static void main(String...args){
        int arr[]={1,2,3,4,5,6};
        int target=7;
        int l=0,r=arr.length-1;
        while(l<r){
            int sum=(arr[l]+arr[r]);
            if(sum==target){
                System.out.println(arr[l]+" "+arr[r]);
                l++;
                r--;
            }
            else if(sum<target){
                r--;
            }
            else{
                l++;
            }
        }
    }
}
