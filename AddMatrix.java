import java.util.*;

public class AddMatrix {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("First Matrix : \nEnter rows and column length :");
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] a1=new int[r][c];
        System.out.println("Enter Elements :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a1[i][j]=s.nextInt();
            }
        }
        System.out.println("Second Matrix :");
        int[][] a2=new int[r][c];
        System.out.println("Enter Elements :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a2[i][j]=s.nextInt();
            }
        }
        int[][] a3=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a3[i][j]=a1[i][j]+a2[i][j];
                System.out.print(a3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
