public class quick_sort {
    public static void quicksort(int[] arr,int si,int ei)
    {   if(si>=ei)
        return;
       int pIND=partion(arr,si,ei);
       quicksort(arr,si,pIND-1);
       quicksort(arr,pIND+1,ei);
    }
    public static int partion(int[] arr,int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<=ei;j++)
        {
            if(arr[j]<pivot)
            {   i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
       return i;
    }

    public static void main(String[] args)
    {
        int[] arr={6,3,9,8,2,5};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
