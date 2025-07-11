class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedListProgram{
    Node head;

    void addNode(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }else{
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }

    void addNodeIndex(int pos, int data){
        Node n=new Node(data);
        if(pos==0){
            n.next=head;
            head=n;
            return;
        }
        Node temp=head;
        int count=1;
        while(count<pos-1){
            temp=temp.next;
            count++;
        }
        n.next=temp.next;
        temp.next=n;
    }

    void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void deleteFirst(){
        if(head!=null){
            head=head.next;
        }
    }

    void deleteLast(){
        if(head==null || head.next==null){
            head=null;
            return;
        }

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public static void main(String[] args) {
        LinkedListProgram l = new LinkedListProgram();

        l.addNode(1);
        l.addNode(2);
        l.addNode(3);
        l.addNode(4);
        l.addNode(5);
        l.addNodeIndex(3,5);

        System.out.print("Original List: ");
        l.printList();

        l.deleteFirst();
        System.out.print("After deleting first: ");
        l.printList();

        l.deleteLast();
        System.out.print("After deleting last: ");
        l.printList();
    }
}