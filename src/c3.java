import java.util.Scanner;
public class c3 {
    public static void main()
    {
    /*    Scanner sc=new Scanner(System.in);
        String[] s ={"apple","mango","gauva","grapes"};
        String largest=s[0];
        for(int i=0;i<s.length;i++)
        {
            if(largest.compareTo(s[i])<0)
                largest=s[i];
        }
        System.out.println(largest);
*/
        StringBuilder ob=new StringBuilder("");
        for(char ch='a';ch<='z';ch++)
        {
            ob.append(ch);
        }
        System.out.println(ob);

    }
}
