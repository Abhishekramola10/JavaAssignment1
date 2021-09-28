import java.util.ArrayList;
import java.util.Iterator;

public class list{
    public static void main(String args[]) {
        ArrayList<Float> list = new ArrayList<>();
        int i = 1;
        float sum=0F;
        list.add(1.01F);
        list.add(2.01F);
        list.add(3.01F);
        list.add(4.01F);
        list.add(5.01F);
        System.out.println("Entered elements");
        for (Float f : list) {
            System.out.println(i + "-" + f);
            i++;
        }
        Iterator<Float> itr = list.iterator();
        while (itr.hasNext()) {
            sum=sum+itr.next();
        }
        System.out.print(sum);
    }
}
