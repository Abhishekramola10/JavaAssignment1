interface concat //functional interface: single functionality abstract method
{
    String concatination(String a, String b);
}

public class firstc {
    public static void main(String[] args) {
        String x= "Abhishek";
        String y= "Ramola";

        concat c =(String a, String b)-> a+b;
        String answer = c.concatination(x,y);
        System.out.println(answer);
    }
}
