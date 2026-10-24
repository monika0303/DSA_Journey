public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public Node head;
    public Node tail;
    int size=0;
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if (head==null)
        {
            head=tail=newNode;
            size++;
            return;
        }
        size++;
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void reverse()
    {
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.prev=next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
    }
    public void removeFast()
    {
        if (tail==head)
        {
            tail=head=null;
            size--;
            return;

        }
        head=head.next;
        head.prev=null;
        size--;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if (head==null)
        {
            head=tail=newNode;
            size++;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=tail.next;
        size++;
    }
    public void removeLast()
    {
     if(head==tail)
     {
         head=tail=null;
         size--;
         return;
     }
     tail=tail.prev;
     tail.next=null;
     size--;

    }
    public static void main(String[] args)
    {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.removeFast();
        dll.removeFast();
        System.out.println();
        dll.print();
        System.out.println();
        dll.addLast(5);
        dll.addLast(6);
        dll.addLast(7);
        dll.print();
        System.out.println();
        dll.removeLast();
        dll.print();
        System.out.println();
        dll.reverse();
        dll.print();
    }
}
