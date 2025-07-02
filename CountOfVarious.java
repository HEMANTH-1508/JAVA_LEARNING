public class CountOfVarious {
    public static void main(String[] args){
        int[] a={-22,65,98,9,3,45,-66,4,67,334,45,-64,56,22,23,23,0,0};
        int even=0,odd=0,positive=0,negative=0,zero=0;
        for(int num:a){
            if(num%2==0){
                even++;
            }else{
                odd++;
            }
            if(num<0){negative++;}
            if(num>0){positive++;}
            if(num==0){zero++;}
        }
        System.out.print("Count of \nPositive  : "+positive+"\nNegative : "+negative+"\nZero  : "+zero+"\nEven : "+even+"\nodd : "+odd);
    }
}
