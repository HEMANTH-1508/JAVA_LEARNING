public class AvaerageArray {
    public static void main(String[] args){
        int[] a={10,20,30,40,50};
        int sum=0,count=0;
        for(int num:a){
            sum+=num;
        }
        int avg=sum/a.length;
        for(int num:a){
            if(num>avg){
                count++;
            }
        }
        System.out.print("Average : "+avg+"\nCount  : "+count);
    }
}
