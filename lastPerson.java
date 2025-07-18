public class lastPerson {
    public static int LastPerson(int n,int k){
        int result=0;
        for(int i=2; i<=n; i++){
            result=(result+k)%i;
        }
        return result+1;
    }
    public static void main(String...args){
        int n=75;
        int k=2;
        int last=LastPerson(n,k);
        System.out.println("last survivor 1st method : "+last);


        // second method
        int x=0;
        while(Math.pow(2,x)<=n){
            x++;
        }
        x--;
        int y=n-((int)(Math.pow(2,x)));

        System.out.println("last survivor 2nd method : "+ (2*y+1));
    }
}