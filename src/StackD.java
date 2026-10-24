import java.util.*;
public class StackD {
 /*   public static void pushAtBottom(Stack<Integer>s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args)
    {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
    */
    /*
    public static String reverseString(String str)

    {
        Stack<Character>s=new Stack<>();
        int idx=0;
        while(idx<str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty())
        {
            result.append(s.pop());
        }
        str=result.toString();
        return str;
    }
    public static void main(String[] args)
    {
        String str="abc";
        String result=reverseString(str);
        System.out.println(result);
    }
    */
    public static void pushAtBottom(Stack<Integer>s,int data)
    {
        if (s.isEmpty())
        {
         s.push(data);
         return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void reverse(Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }
    public static void main(String[] args)
    {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
