public class LastSurvivor {

    public static int looping(int n, int k){
        if(n==1)
            return 0;
        return (looping(n-1, k)+k)%n;
    }
    public static void main(String...args){
        int n=7;
        int k=2;
        int last=looping(n,k)+1;
        System.out.println(last);
    }
}
