interface compare   //functional interface- abstract method with single functionality
{
   boolean calculate(int x, int y);
}

class Test
{
    public static void main(String args[])
    {
        int a = 6;
        int b =4;

        // lambda expression to define the calculate method
        compare s =(int x,int y)-> x>y;
        boolean ans = s.calculate(a,b);
        System.out.println(ans);
    }
}