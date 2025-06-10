public class ButterflyPattern {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(l);
            }

            System.out.println();
        }
        for(int a=n-1;a>=1;a--){
            for(int b=1;b<=a;b++){
                System.out.print(b);
            }
            for(int c=1;c<=2*(n-a);c++){
                System.out.print(" ");
            }
            for(int d=1;d<=a;d++){
                System.out.print(d);
            }
            System.out.println();
        }
    }
}