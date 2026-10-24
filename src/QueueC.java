import java.util.*;
/*
first non repeating
public class QueueC {
    public static void Nonrepeating(String s)
    {
        Queue<Character>q=new LinkedList<>();
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1)
            {
                q.remove();
            }
            if(q.isEmpty())
                System.out.print(-1+" ");
            else
                System.out.print(q.peek()+" ");
            System.out.println();
        }
    }
    public static void main() {
        String s="aabccxb";
        Nonrepeating(s);
    }
}*/
/* mixing-interleaving
public class QueueC{
    public static void interleave(Queue<Integer>q)
    {
        Queue<Integer>q1=new LinkedList<>();
        int size=q.size();
        for(int i=1;i<=size/2;i++)
        {
              q1.add(q.remove());
        }
        while(!q1.isEmpty())
        {
            q.add(q1.remove());
            q.add(q.remove());
        }

    }
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleave(q);
        while(!q.isEmpty())
        {
            System.out.print(q.peek());
            q.remove();
        }

    }
}
 */
/*reverse queue
public class QueueC{
    public static void reverse(Queue<Integer>q)
    {
        Stack<Integer>s=new Stack<>();
        while(!q.isEmpty())
        {
            s.push(q.peek());
            q.remove();
        }
        while(!s.isEmpty())
        {
           q.add(s.peek());
           s.pop();
        }


    }
    public static void main(String[] args)
    {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }
}*/
/* deque
public class QueueC {
    public static void main(String[] args){
        Deque<Integer>q=new LinkedList<>();
        q.addFirst(1);
        q.addFirst(2);
        q.addLast(3);
        q.addLast(4);
        System.out.println(q);
        q.removeLast();
        System.out.println(q);
        System.out.println("first element="+q.getFirst());
        System.out.println("last element="+q.getLast());
    }
}
*/
/* stack using deque
public class QueueC {
    public static class  Stack{
        Deque<Integer>deque=new LinkedList<>();
        public void push(int data)
        {
            deque.addLast(data);
        }
        public int pop()
        {
            return deque.removeLast();
        }
        public int peek()
        {
            return deque.getLast();
        }
    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("peek="+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}*/
public class QueueC
{
    static class Queue
    {
        Deque<Integer> deque=new LinkedList<>();
        public void add(int data){
            deque.addLast(data);
        }
        public int remove()
        {return deque.removeFirst();
        }
        public int peek()
        {return deque.getFirst();
        }
    }
    public static void main(String[] args)
    {Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek:"+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());}}