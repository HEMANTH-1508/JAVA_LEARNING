public class FirstOccurence {
    public static void main(String[] args) {
        int[] nums ={0,1,1,2,2,2,3,3,4,4};
        int n=4;
        int l=0, r=nums.length-1;
        int target=0;
        while(l<=r){
            int mid=(r+l)/2;
            if (nums[mid]==n){
                target=mid;
                r=mid-1;
            }
            if(nums[mid]<n){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(target!=-1){
            System.out.println(target);
        }
    }
}
