public class ZerotoLast {
    public static void main(String...args){
        int[] arr={2, 0, 4, 5, 0, 1, 0, 6};
        int[] arr2=new int[arr.length];
        int index=0;
        for(int i=0; i<arr.length ; i++){
            if(arr[i]!=0){
                arr2[index]=arr[i];
                index++;
            }
        }
        for(int num : arr2){
            System.out.println(num);
        }
    }
}
