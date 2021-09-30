import java.util.ArrayList;
import java.util.List;

public class Eleven {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(5);
        lst.add(3);
        lst.add(4);
        lst.add(2);
        lst.add(5);

        double sum = 0;
        double avg;
        double cd;
        for (Integer integer : lst) {
            cd = integer*integer;
            sum=sum+cd;
        }
        avg=sum/lst.size();
        System.out.println(avg);
    }
}

