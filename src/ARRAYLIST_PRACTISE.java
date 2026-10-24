import java.util.ArrayList;
import java.util.Collections;
public class ARRAYLIST_PRACTISE {
    public static void main(String[] args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(1,9);
        System.out.println(list);
        int element=list.get(1);
        System.out.println(element);
        list.remove(1);
        System.out.println(list);
        list.set(1,0);
        System.out.println(list);
        System.out.println(list.contains(11));
     System.out.println(list.size());
     for (int i=list.size()-1;i>=0;i--)
     {
         System.out.print(list.get(i)+" ");
     }
     System.out.println();
     int max=Integer.MIN_VALUE;
     for (int i=0;i<list.size();i++)
     {
         if(max<list.get(i))
             max=list.get(i);
     }
     System.out.println(max);

     int index1=1,index2=4;
     int temp=list.get(index1);
     list.set(index1,list.get(index2));
     list.set(index2,temp);
      System.out.println(list );
      // sorting
     Collections.sort(list);
     System.out.println(list);
     //decending
     Collections.sort(list,Collections.reverseOrder());
     System.out.println(list);


    }
}
