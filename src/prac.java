import java.util.Scanner;

class prac {
    public static int[] subarray_sum(int arr[])
    {
        int n=arr.length;
        int max_sum=arr[0];
        int min_sum=arr[0];
        for(int i=0;i<=n-1;i++)
        {
            for(int j=i;j<=n-1;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                max_sum=Math.max(sum,max_sum);
                min_sum=Math.min(sum,min_sum);
            }

        }return new int[] {max_sum,min_sum};
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enetr no. of array elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("eneter "+n+"array elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
       int[] sum= subarray_sum(arr);
        System.out.println(sum[0]+" "+sum[1]);
    }
}