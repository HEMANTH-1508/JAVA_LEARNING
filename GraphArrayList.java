import java.util.ArrayList;

class bommalu{
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    bommalu(int n){
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
    }

    public void add(int v1,int v2){
        adj.get(v1).add(v2);
        adj.get(v2).add(v1);
    }

    public void printingu(){
        for(int i=0;i< adj.size();i++){
            System.out.print(i+" ");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

public class GraphArrayList {
    public static void main(String...args){
        bommalu obj=new bommalu(4);
        obj.add(0,1);
        obj.add(2,3);
        obj.printingu();
    }
}
