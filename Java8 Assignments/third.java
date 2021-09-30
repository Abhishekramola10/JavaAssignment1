interface UsingInstancemethod1     //functional interface for addition
{
    void add(int a, int b);
}

interface UsingInstancemethod2     //functional interface for subtraction
{
    void subtract(int c, int d);
}

interface UsingStaticmethod3         //functional interface for multiplication
{
    void multiply(int e, int f);
}

public class third {

    public void addition(int a, int b)
    {
        int r = a+b;
        System.out.println(r);
    }

    public void subtraction(int c, int d)
    {
        int s = c-d;
        System.out.println(s);
    }

    public static void multiplication(int e, int f){
        int t = e*f;
        System.out.println(t);
    }

    public static void main(String[] args) {

        third ob = new third();
        int w = 1;
        int x = 2;
        int y = 3;
        int z = 4;
        int l = 3;
        int m = 2;

        UsingInstancemethod1 i1 = ob::addition;
        i1.add(w,x);

        UsingInstancemethod2 i2 = ob::subtraction;
        i2.subtract(y,z);

        UsingStaticmethod3 i3 = third::multiplication;
        i3.multiply(l,m);

    }
}
