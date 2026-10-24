import java.util.*;
public class sub_array {
    public static void subarray(int arr[])
    {
   int n=arr.length;
   for(int i=0;i<=n-1;i++)
   {
       for(int j=i;j<=n-1;j++)
       {
           for(int k=i;k<=j;k++)// start to end
           {
               System.out.print(arr[k]);
           }
           System.out.println("");
       }
   }

    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the number");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("eneter "+n+"array elements");
        for(int i=0;i<=n-1;i++)
            arr[i]=sc.nextInt();
        subarray(arr);

    }
}
