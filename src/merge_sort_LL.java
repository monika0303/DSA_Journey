import java.util.LinkedList;

public class merge_sort_LL {
    public  static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
   private Node getMid(Node head)
   {
       Node slow=head;
       Node fast=head.next;
       while( fast!=null &&fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
       }
       return slow;//mid node
   }
   private Node merge(Node head1,Node head2){
       Node mergedLL=new Node(-1);
       Node temp=mergedLL;
       while(head1!=null &&head2!=null)
       {
           if(head1.data<head2.data){
               temp.next=head1;
               head1=head1.next;
               temp=temp.next;
           }
           else{
               temp.next=head2;
               head2=head2.next;
               temp=temp.next;
           }
       }
       while(head1!=null)
       {temp.next=head1;
           head1=head1.next;
           temp=temp.next;
       }
       while(head2!=null)
       {temp.next=head2;
           head2=head2.next;
           temp=temp.next;}
       return mergedLL.next;
   }
    public Node mergeSort(Node head)
    {
        if(head==null || head.next==null )
        return head;
       //find mid
        Node mid=getMid(head);
       //left & right MS
        Node rightHead=mid.next;
        mid.next=null;
        Node newleft=mergeSort(head);
        Node newright=mergeSort(rightHead);
        //merge
        return merge(newleft,newright);
    }
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    void zigzag()
    {
        Node slow=head;
        Node fast=head.next  ;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null && right!=null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;

        }

    }
    public static void main(String[] args)
    {
        //LinkedList<Integer>list=new LinkedList<>();
        merge_sort_LL list=new merge_sort_LL();
        list.addLast(3);
        list.addLast(2);
        list.addFirst(4);
        list.addFirst(5);
        list.addLast(1);
        //System.out.println();
        list.print();
        System.out.println();
        list.head=list.mergeSort(list.head);
        list.print();
        list.zigzag();
        System.out.println();
        list.print();
    }
}
