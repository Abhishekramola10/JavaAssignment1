import java.util.*;
public class sixth {
    static Character[] ch ={'a', 'e', 'i', 'a', 'e', 'i', 'i', 'o', 'u'};   //req output: i,i,i,a,a,e,e,o,u
    public static void main(String[] args) {
        List<Character> list = Arrays.asList(ch);
        sendlist(list);
    }

    public static  void sendlist(List < Character > list)
        {
            int n = ch.length;
            HashMap<Character, Integer> hp = new HashMap<>();
            HashMap<Character, Integer> mapIndex = new HashMap<Character, Integer>();
            for (int i = 0; i < n; i++) {
                if (hp.containsKey(ch[i])) {
                    hp.put((ch[i]), hp.get(ch[i]) + 1);
                } else {
                    hp.put(ch[i], 1);
                    mapIndex.put(ch[i], i); //catches first occurence of element
                }
            }

    Collections.sort(list,new Comparator<Character>()
    {
        public int compare (Character n1, Character n2)
        {
            int freq1 = hp.get(n1);
            int freq2 = hp.get(n2);
            if (freq1 != freq2) {
                return freq2 - freq1;//element with greater frequency comes first
            } else {
                return mapIndex.get(n1) - mapIndex.get(n2);//element with earlier occurence comes first
            }
        }
    });
    System.out.println(list);
}
}


