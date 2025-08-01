public class DSUAlgorithm {
    static class DSU{
        int[] parent;

        DSU(int n){
            parent=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }

        public int find(int x){
            if(parent[x]!=x){
                parent[x]=find(parent[x]);
            }
            return parent[x];
        }

        public  void union(int x,int y){
            int one=find(x);
            int two=find(y);
            if(one==two){
                return;
            }

        }
    }


    public static void main(String...args){
        DSU obj=new DSU(5);
        for(int i=0;i<5;i++){
            System.out.println(obj.find(i));
        }
    }
}
