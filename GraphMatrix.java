class dabba{

    int[][] adj;
    dabba(int n){
        adj=new int[n][n];
    }

    void add(int v1,int v2){
        adj[v1][v2]=1;
        adj[v2][v1]=1;
    }

    void print(){
        for(int i=0;i< adj.length;i++){
            for(int j=0;j< adj.length;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
}



public class GraphMatrix {
    public static void main(String...args){
        dabba obj=new dabba(4);
        obj.add(0,1);
        obj.add(2,3);
        obj.print();
    }
}
