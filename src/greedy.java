import java.util.*;
/*activity selection
public class greedy {
    static void main() {   //0{n}
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        int maxact=0;
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(0);
        maxact++;
        int lastend=end[0];
        for(int i=0;i<end.length;i++)
        {
            if(start[i]>=lastend)
            {
                maxact++;
                lastend=end[i];
                ans.add(i);
            }
        }
        System.out.println(maxact);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print("A"+ans.get(i)+" ");
        }

    }
}*/
//activity for unordered end time
public class greedy {
    static void main() {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        //sorting
        int[][] activities=new int[start.length][3];
        for(int i=0;i<start.length;i++)
        {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        // lambda function ->shortform
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        int maxact=0;
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(0);
        maxact++;
        int lastend=activities[0][2];
        for(int i=0;i<start.length;i++)
        {
            if(start[i]>lastend)
            {
                maxact++;
                ans.add(activities[i][0]);
                lastend=activities[i][2];
            }
        }
        System.out.println(maxact);
    }
}
