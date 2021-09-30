interface uppercase
{
    String uprcase(String a);
}
public class firstd {
    public static void main(String[] args) {
        String x = "abhishek";

        uppercase uc = (String a)->a.toUpperCase();

        String answer=uc.uprcase(x);
        System.out.println(answer);
    }
}
