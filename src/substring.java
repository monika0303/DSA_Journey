import java.util.*;
public class substring {
    public static String substring(String str,int start,int end)
    {
        String s="";
        for(int i=start;i<end;i++)
            s=s+str.charAt(i);
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the main string");
        String str=sc.nextLine();
        System.out.println("eneter starting and ending index of substring");
        int start=sc.nextInt();
        int end=sc.nextInt();
        String str1=substring(str,start,end);
        System.out.println(str1);
        System.out.println(str.substring(0,3));
    }
}
