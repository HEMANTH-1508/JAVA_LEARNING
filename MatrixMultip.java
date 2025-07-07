import java.util.Scanner;

public class MatrixMultip {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("First Matrix : \nEnter rows and column length :");
        int r1=s.nextInt();
        int c1=s.nextInt();
        int[][] a1=new int[r1][c1];
        System.out.println("Enter Elements :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a1[i][j]=s.nextInt();
            }
        }
        System.out.println("Second Matrix :\nEnter rows and column length :");
        int r2=s.nextInt();
        int c2=s.nextInt();
        int[][] a2=new int[r2][c2];
        System.out.println("Enter Elements :");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                a2[i][j]=s.nextInt();
            }
        }

        if (c1 == r2){
            int[][] result = new int[r1][c2];
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    for(int k=0; k<c1; k++){
                        result[i][j] += a1[i][k]*a2[k][j];
                    }
                }
            }
            System.out.println("Resultant Matrix:");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
