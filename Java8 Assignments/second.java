interface Return_One
{
    int Give_One(int a, int b);
}
public class second {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        Return_One rone =(int a, int b)-> a;
        int answer = rone.Give_One(x,y);
        System.out.println(answer);
    }
}
