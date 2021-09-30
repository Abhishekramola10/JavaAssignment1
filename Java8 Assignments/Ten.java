import java.util.ArrayList;
import java.util.List;

public class Ten {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(5);
        lst.add(9);
        lst.add(121);
        lst.add(1);
        lst.add(4);
        int cd;
        int sum=0;
        for (Integer integer : lst) {
            cd = integer;
            if (cd>5)
                sum=sum+cd;
        }
        System.out.println(sum);
    }
}
