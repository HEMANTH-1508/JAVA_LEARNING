public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {25,12,26,46,67};
        int target=4;
        int left=0, right=nums.length-1;
        while(left<=right){
            int mid=(right+left)/2;
            if (nums[mid]==target){
                System.out.println("elemnt found at : "+mid);
                break;
            }
            if(nums[mid]>target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
    }
}
