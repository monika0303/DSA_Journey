public class permutation {
public static void find(String str,String ans){
    //base
    if(str.length()==0)
    { System.out.println(ans);
        return;}

    //recursive
    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        String NewString=str.substring(0,i)+str.substring(i+1);
        find(NewString,ans+ch);
    }
}
public static void main(String[] args){
    String str="abc";
    String ans="";
    find(str,ans);
}
}
