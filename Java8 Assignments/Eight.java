interface TestInterface1
{
    default void show()
    {
        System.out.println("Default TestInterface1");
    }
}

interface TestInterface2
{
    default void show()
    {
        System.out.println("Default TestInterface2");
    }
}

class Eight implements TestInterface1, TestInterface2       //Implementing Multiple Inheritance
{
    // Overriding default show method
    public void show()
    {
        TestInterface1.super.show();

        TestInterface2.super.show();
    }

    public static void main(String args[])
    {
        Eight d = new Eight();
        d.show();
    }
}