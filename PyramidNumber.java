public class PyramidNumber {
    public static void main(String[] args){
        int n=5,a=0;
        for (int i=1;i<n;i++){
            for (int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
