import java.util.*;
public class stack_span {
  /*     STACK SPAN
   public static void stockSpan(int stocks[],int span[])
    {
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stocks.length;i++)
        {
          int currPrice=stocks[i];
          while(!s.isEmpty() && currPrice>stocks[s.peek()]){
              s.pop();
          }
          if(s.isEmpty())
          {
              span[i]=i+1;
          }
          else{
              int prevHigh=s.peek();
              span[i]=i-prevHigh;
          }
          s.push(i);
        }
    }
    public static void main(String[] args)
    {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]+" ");
        }
    }*/
     // NEXT GREATER ELEMENT
    public static void main(String[] args)
    {
        int arr[] ={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nextGreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {

            //while
            while(!s.isEmpty() && arr[s.peek()]<arr[i])
            {
                s.pop();
            }
            //if else
            if (s.isEmpty())
                nextGreater[i]=-1;
              else
                  nextGreater[i]=arr[s.peek()];
            //push
            s.push(i);
        }
        for(int i=0;i<=nextGreater.length-1;i++)
        {
            System.out.println(nextGreater[i]+" ");
        }

    }

}


