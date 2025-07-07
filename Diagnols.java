import java.util.Scanner;

public class Diagnols {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Primary Diagnol: ");
        for(int i=0;i<r;i++){
            System.out.print(a[i][i] + " ");
        }

        System.out.println("\nSecondary Diagnol: ");
        for(int i=0;i<r;i++){
            System.out.print(a[i][a.length-i-1] + " ");
            for(int j=0;j<c;j++){
                if(i+j==c-1){

                }
            }
        }
    }
}
