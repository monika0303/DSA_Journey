import java.util.Scanner;

public class toupper {

    public static int count(String str)
    {  int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                count++;
        }
        return count;
    }
    public static String upper(String str)
    {   StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i-1)==' ' && str.charAt(i)!=' ')
            {
                ch=Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        //System.out.println(upper(str));
        System.out.println(count(str));
    }
}
