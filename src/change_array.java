public class change_array {
    public static void changeArray(int[] arr,int i,int val){
        //base
        if(i==arr.length) {
            printing(arr);
            return;
        }

        //recursive
        arr[i]=val;
        changeArray(arr,i+1,val+1);
        arr[i]=arr[i]-2;

    }
    public static void printing(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args)
    {
        int[] arr=new int[5];
        changeArray(arr,0,1);
        printing(arr);
    }
}
