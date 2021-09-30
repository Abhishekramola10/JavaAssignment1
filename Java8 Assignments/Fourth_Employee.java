interface Get_Values    //functional interface
{
    Fourth_Employee Getting(String n,int a, String c); //return type=class
}

public class Fourth_Employee
{
    Fourth_Employee(String n,int a, String c)
    {
        System.out.println("Name-"+n);
        System.out.println("Age-"+a);
        System.out.println("City-"+c);
    }
    public static void main(String[] args) {
        String name ="Abhishek";
        int age = 23;
        String city = "Dehradun";

        Get_Values ob = Fourth_Employee::new; //refering to constructor using functional interface
        ob.Getting(name,age,city);
    }
}
