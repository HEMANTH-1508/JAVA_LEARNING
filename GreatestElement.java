public class GreatestElement {
    public static void main(String[] args){
        int[] a={22,65,98,9,3,45,66,4,67,334,45,864,56,22,23,23,};
        int max=a[0];
        int min=a[0];
        for(int num:a){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        System.out.print("Max Element : "+max+"\nMin Element : "+min);
    }
}
