import java.util.*;
public class third {
    public static void method(String s) {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        char ar[] = s.toCharArray();
        for (char c : ar)
        {
            if (hmap.containsKey(c))
                hmap.put(c, hmap.get(c) + 1);
            else
                hmap.put(c, 1);
        }

            for (Map.Entry entry : hmap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String");
            String str = sc.nextLine();
            method(str);
        }
    }


