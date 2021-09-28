import java.io.*;
import java.lang.*;
import java.util.*;

class Employee
{
    Double Age, Salary;
    String Name;

    public Employee(Double age, Double sal, String name)
    {
        this.Age = age;
        this.Salary = sal;
        this.Name = name;
    }
    public String toString()
    {
        return this.Age + " " + this.Salary + " "
                + this.Name;
    }
}

class SortBySalary implements Comparator<Employee>
{
    @Override
    public int compare(Employee a, Employee b)
    {
        return (int)(b.Salary - a.Salary);
    }
}
public class Employee2
{
    public static void main(String args[])
    {
        Employee ob1 = new Employee(23D, 37000D, "Abhishek");
        Employee ob2 = new Employee(24D, 38000D, "Ayush");
        Employee ob3 = new Employee(25D, 39000D, "Ishu");

        ArrayList<Employee> ar = new ArrayList<Employee>();
        ar.add(ob1);
        ar.add(ob2);
        ar.add(ob3);

        Collections.sort(ar, new SortBySalary());
        System.out.println("\nSorted by Salary");
        for(int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}