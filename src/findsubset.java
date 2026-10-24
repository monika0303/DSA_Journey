public class findsubset {
    public static void finding(String str,String ans,int i){
        //base case
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }
        //recursion

        //yes choice
        finding(str,ans+str.charAt(i),i+1);
        //no choice
        finding(str,ans,i+1);
    }
    public static void main(String[] args)
    {
        String str="abc";
        String arr=" ";
        finding(str,arr,0);
    }
}
