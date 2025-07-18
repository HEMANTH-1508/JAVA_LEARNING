public class NumberofSets {
    public static void main(String...args){
        int a=5;
        int c=0;
        while(a!=0){
            c+=(a&1);
            a=a>>1;
        }
        System.out.println(c);

        int i=1;
        int bm=1<<i;
        int notbm=~bm;
        System.out.println(a&notbm);
    }
}
