interface MyInterface{
    default void display() {     //default method
        System.out.println("display method of MyInterface");
    }
}
public class Seventh implements MyInterface{
    public static void main(String args[]) {
        Seventh obj = new Seventh();
        obj.display();
    }
}