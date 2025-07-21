public class WaterMinimum {
    public static void main(String...args){
        int[] arr={1,3,2,0,1,4,2};
        int leftmax=0,rightmax=0;
        int li=0,ri=0;
        int l=0,r=arr.length-1;
        int mid=(l+r)/2;
        while(l<mid){
            if(arr[l]>leftmax){
                leftmax=arr[l];
                li=l;
            }
            l++;
        }
        while(r>mid){
            if(arr[r]>rightmax){
                rightmax=arr[r];
                ri=r;
            }
            r--;
        }

        int water=0;
        for(int i=(li+1);i<ri;i++){
            water+= Math.min(leftmax,rightmax)-arr[i];
        }
        System.out.println(water);
    }
}
