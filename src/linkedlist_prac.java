public class linkedlist_prac {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
   // Node tail;
    void insertAtBeginning(int data)
    {
     Node node=new Node(data);
     node.next=head;
     head=node;
     //if(tail==null)
        // tail=node;
    }
    void insertAtEnd(int data){
        Node node=new Node(data);
        // tail.next=node;
        //tail=node;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
    }
    void insertAtPos(int data,int pos){
     if (pos==1)
     {
         insertAtBeginning(data);
         return;
     }
     Node newNode=new Node(data);
     Node temp=head;
     for(int i=1;i<pos-1&&temp!=null;i++) {
         temp=temp.next;
     }
     if(temp==null){
         System.out.println("invalid position");
         return;}
     newNode.next=temp.next;
     temp.next=newNode;
    }
    void tranverse() {
        Node  temp=head;
        while(temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void search(int value){
        Node temp=head;
        int pos=1;
        while(temp!=null)
        {
            if(temp.data==value)
            {
                System.out.println("element found at index"+pos);
                return;
            }
            temp=temp.next;
            pos++;
        }
        System.out.println("not found");
    }
    void deleteBeg(){
        if(head==null)
        {
            System.out.println("empty list");
            return ;
        }
      head=head.next;
    }
    void deleteEnd(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        if(head.next==null)
        {head=null;
        return;}
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp
                    .next;
        }
        temp.next=null;
    }
    void deleteValue(int value)
    {
        if(head==null)
        {
            System.out.println("empty list");
            return;
        }
        if(head.data==value)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.data!=value)
        {
            temp=temp.next;
        }
        if(temp.next==null) {
            System.out.println("Value not found");
        }
        else
        {
            temp.next=temp.next.next;
        }
    }
    int iterative_aearch(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }
    int helper(Node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
            return 0;
        int idx= helper(head.next,key);
        if (idx==-1)
            return -1;
        return 1+idx;
    }
    int rec_search(int key)
    {
        return helper(head,key);
    }
    void reverse()
    {
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    void deletenthfromend(int n)
    {
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        if (n==size)
        {
            head=head.next;
            return;
        }
        int sz=size-n;

        Node prev=head;
        for(int i=1;i<sz;i++){
            prev=prev.next;

        }
        prev.next=prev.next.next;
        return;
    }
    public Node findmid()
    {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    boolean checkpalindrome()
    {
        if (head==null ||head.next==null)
            return true;
        //step 1 find mid
        Node midNode=findmid();

        //step2 reverse from mid to end
        Node prev=null;
        Node curr=midNode;
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

        //checking left half and right half
        while(right!=null)
        {
            if(left.data!=right.data)
                return false;
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args)
    {
     linkedlist_prac list=new linkedlist_prac();
     list.insertAtBeginning(10);
     list.insertAtBeginning(11);
     list.insertAtBeginning(17);
     list.tranverse();
     System.out.println(" ");
     list.insertAtEnd(155);
     list.insertAtPos(144,2);
     list.insertAtPos(121,4);
     list.tranverse();
     System.out.println(" ");
     list.deleteBeg();
     list.deleteEnd();
     list.search(174);
     //list.deleteValue(144);
     list.tranverse();
     System.out.println(list.iterative_aearch(154));
     System.out.println(list.rec_search(11));
     System.out.println(list.rec_search(123));
     list.reverse();
     list.tranverse();
     list.deletenthfromend(1);
     System.out.println();
     list.tranverse();
     list.deleteEnd();
     list.deleteEnd();
     list.deleteEnd();
     list.tranverse();
     list.insertAtBeginning(1);
     list.insertAtBeginning(2);
     list.insertAtBeginning(2);
   //  list.insertAtBeginning(1);
     list.tranverse();
     System.out.println(list.checkpalindrome());
    }
}
