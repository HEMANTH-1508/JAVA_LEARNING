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
}

public class TreeSetExample {
    public static void main(String[] args) {
        searchTree element=new searchTree();
        element.insert(30);
        element.insert(50);
        element.insert(10);
        element.insert(20);
        element.insert(90);
        element.insert(15);

        System.out.println("Inorder Traversal :  ");
        element.inorderTraversal(element.root);
        System.out.println("\nPreorder Traversal : ");
        element.preorderTraversal(element.root);
        System.out.println("\nPostorder Traversal : ");
        element.postorderTravesal(element.root);
        System.out.println("\nHeight of Tree : ");
        System.out.print(element.findHeight(element.root));
        System.out.println("\nMirror of Tree : ");
        element.mirrorTree(element.root);
    }
}
