import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;

public class Fifth {
    public static void main(String args[])
    {
        // Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);  //using consumer interface

        // Implement display using accept()
        display.accept(10);     //accept() of Consumer Interface

        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();     //using supplier interface producing a random value

        // Print the random value using get()
        System.out.println(randomValue.get());   //get() of Supplier Interface

        Predicate<Integer> pr = a -> (a > 18);                   // Creating predicate interface object
        System.out.println(pr.test(10));                      // Calling Predicate method

        Function<String, Integer> func = x -> x.length();          //using Function interaface
        Integer apply = func.apply("Function");   // 8
        System.out.println(apply);
    }
}