import java.io.*;
import java.lang.*;
import java.util.*;

class  Student{
    String Name;
        Double Score, Age;

        Student(String name,Double score,Double age)
            {
                this.Name=name;
                this.Score=score;
                this.Age=age;
            }
    public String toString()
        {
        return this.Name + " " + this.Score + " "
        + this.Age;
        }
}

class SortByScore implements Comparator<Student>
{
    @Override
    public int compare(Student a, Student b)
    {
        if(a.Score != b.Score)
            return (int)(b.Score - a.Score);
        else
           return (int)(b.Name.compareTo(a.Name));
    }
}

public class fifth
{
    public static void main(String args[])
    {
        Student ob1 = new Student("Abhishek",90D,23D);
        Student ob2 = new Student("Ayush",85D,24D);
        Student ob3 = new Student("Ishu",92D,23D);

        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(ob1);
        ar.add(ob2);
        ar.add(ob3);

        Collections.sort(ar, new SortByScore());
        System.out.println("\nSorted by Salary");
        for(int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
