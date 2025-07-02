public class SecondLargest {
    public static void main(String[] args){
        int[] a={22,65,98,9,3,45,66,4,67,334,45,864,56,22,23,23,};
        int firstmax=a[0];
        int secmax=a[0];
        for(int num:a){
            if(num>firstmax){
                secmax=firstmax;
                firstmax=num;
            }
            else if(num>secmax && num!=firstmax){
                secmax=num;
            }
        }
        System.out.print("1st Max Element : "+firstmax+"\n2nd Max Element : "+secmax);
    }
}
