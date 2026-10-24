import java.util.*;
public class first {
    public static boolean printing(String word)
    {
        for(int i=0;i<word.length()/2;i++)
        {
            if(word.charAt(i)!=word.charAt(word.length()-1-i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("enter the string");
        String s3=sc.nextLine();

       // System.out.println(s3+" "+s4);
       // String news=s3+" "+s4;
        System.out.println(printing(s3));

    }

}
