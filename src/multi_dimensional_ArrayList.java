import java.util.ArrayList;

public class multi_dimensional_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainlist.add(list1);
        mainlist.add(list2);

        for(int i=0;i<mainlist.size();i++)
        {
            ArrayList<Integer> curr=mainlist.get(i);
            for(int j=0;j<curr.size();j++)
                System.out.print(curr.get(j));
            System.out.println();
        }
        ArrayList<ArrayList<Integer>>big=new ArrayList<>();
        ArrayList<Integer>lis1=new ArrayList<>();
        ArrayList<Integer>lis2=new ArrayList<>();
        ArrayList<Integer>lis3=new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
            lis1.add(1*i);
            lis2.add(2*i);
            lis3.add(3*i);}
        big.add(lis1);
        big.add(lis2);
        big.add(lis3);
        System.out.println(big);
        for(int i=0;i<big.size();i++)
        {
            ArrayList<Integer>curr=big.get(i);
            for(int j=0;j<curr.size();j++)
            {
                System.out.print(curr.get(j));
            }
            System.out.println();
        }
    }

}
