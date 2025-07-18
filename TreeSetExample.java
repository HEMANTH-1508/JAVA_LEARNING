import java.util.*;


class Node{
    int n;
    Node l,r;
    Node(int item){
        n=item;
        l=r=null;
    }
}

class searchTree{
    Node root;

    void insert(int value){
        root=insertValue(root,value);
    }

    Node insertValue(Node root,int value){
        if(root==null){
            return new Node(value);
        }
        if(value<root.n){
            root.l=insertValue(root.l,value);
        }else if(value>root.n){
            root.r=insertValue(root.r, value);
        }
        return root;
    }

    void inorderTraversal(Node node){
        if(node==null){
            return;
        }
        inorderTraversal(node.l);
        System.out.print(node.n+" ");
        inorderTraversal(node.r);
    }

    void preorderTraversal(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.n+" ");
        preorderTraversal(node.l);
        preorderTraversal(node.r);
    }

    void postorderTravesal(Node node){
        if(node==null){
            return;
        }
        postorderTravesal(node.l);
        postorderTravesal(node.r);
        System.out.print(node.n+" ");
    }

    int findHeight(Node node){
        if(node==null){
            return 0;
        }
        int lh=findHeight(node.l);
        int rh=findHeight(node.r);
        return Math.max(lh,rh)+1;
    }

    void mirrorTree(Node node){
        if(node==null){
            return;
        }
        inorderTraversal(node.r);
        System.out.print(node.n+" ");
        inorderTraversal(node.l);
    }

    void search(int val){
        searchelement(root,val);
    }

    boolean searchelement(Node root,int val){
        if(root==null){
            return false;
        }
        return false;
    }
}

public class TreeSetExample {
    public static void main(String[] args) {
        searchTree element=new searchTree();
        int[] val={2,5,4,6,7,3,8,9,1};
        for(int num:val){
            element.insert(num);
        }
    }
}
