public class TowerofHanoi{

    static void solve(int n, char s, char a, char d){
        if(n==1){
            System.out.println("disk 1 from "+s+" to "+d);
            return;
        }
        solve(n-1, s, d, a);
        System.out.println("disk "+n+" from "+s+" to "+d);
        solve(n-1, a, s, d);
    }

    public static void main(String[] args){
        int n=3;
        solve(n, 'A', 'B', 'C');
    }
}
