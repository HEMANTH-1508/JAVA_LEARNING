import java.util.Scanner;

public class zzz
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        int a,b;
        System.out.println("ENTER START NUMBER : ");
        a=s.nextInt();
        System.out.println("ENTER LAST NUMBER : ");
        b=s.nextInt();
        int i;
        for(i=a;i<b;i++)
        {
            for(int j=2;j<i-1;j++)
            {
                if(i%j==0)
                {
                    System.out.print("\t"+i);
                    break;
                }
                else
                {
                    continue;
                }
            }
        }
    }
}
