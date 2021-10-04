package demo.service;

import com.sun.org.apache.xpath.internal.operations.Or;
import demo.domain.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderServiceTest {
    @Test
    public void orderWasPlaced()
    {
        OrderService obj = new OrderService();
        Order obj2 = new Order();

        boolean result = obj.placeOrder(obj2,"Abhishek");

        assertTrue(result);

    }


}
