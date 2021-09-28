import java.util.*;
public class second
{
    public static int method(String s)
    {
        ArrayList<Character> al = new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
            al.add(s.charAt(i));
        HashSet<Character> hset = new HashSet<Character>(al);
        return(hset.size());
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        int counting= method(str);
        System.out.println("No of Unique characters="+counting);
    }
}