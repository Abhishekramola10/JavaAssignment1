import java.util.ArrayList;
import java.util.List;

class Nine {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(11);
        lst.add(12);
        lst.add(13);
        lst.add(14);
        int cd;
        for (Integer integer : lst) {
            cd = integer;
            if (cd % 2 == 0)
                System.out.println(cd);
        }
    }
}