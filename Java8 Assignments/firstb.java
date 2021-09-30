interface increement       //functional interface: interface with an abstract method
{
    int increase(int x);
}

public class firstb {
    public static void main(String[] args) {
        int a =10;
       increement i = (int x)->x+1;
       int answer = i.increase(a);
       System.out.println(answer);
    }
}
