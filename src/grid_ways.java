public class grid_ways {
    public static int countways(int i,int j,int n,int m)
    {
        if(i==n-1 && j==m-1)
            return 1;
        if(i>=n || j>=m)
            return 0;
        return countways(i,j+1,n,m)+countways(i+1,j,n,m);
    }
    public static void main(String[] args)
    {
        int n=3,m=3;
        System.out.println(countways(0,0,n,m));
    }
}
