public class sorted_and_rotated {
    public static int find(int[] arr,int target,int si,int ei)
    {  //base case
        if(si>ei)
            return -1;

        int mid=si+(ei-si)/2;
        //found case
        if(arr[mid]==target)
            return mid;
        //line1
        if(arr[si]<=arr[mid])
        {
          if(arr[si]<=target && target<=arr[mid])
              return find(arr,target,si,mid-1);
          else
              return find(arr,target,mid+1,ei);
        }
        else if(arr[mid]<=arr[ei])
        {
            if(target>=arr[mid] && target<=arr[ei])
                return find(arr,target,mid+1,ei);
            else
                return find(arr,target,si,mid-1);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr={4,5,6,7,0,1,2};
        int tar=2;
        int index=find(arr,tar,0,arr.length-1);
        System.out.println(index);
    }
}
