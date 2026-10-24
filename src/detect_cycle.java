public class detect_cycle {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    Node head;
    boolean iscycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
                return true;
        }
        return false;
    }
    void removecycle()
    {
        //step 1 detecting
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null  ){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                cycle=true;
                break;
            }
        }
        if (cycle==false)
            return;

        //step 2 find meeting point
            slow=head;
            Node prev=null;
            while(fast!=slow)
            {
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
        //step 3 remove cycle lastnode=null
        prev.next=null;
    }
    void main(String[] args){
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
       head.next.next.next=temp;
        System.out.println(iscycle());
        removecycle();
        System.out.println(iscycle());
    }
}
