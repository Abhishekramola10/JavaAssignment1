package demo.service;

import demo.domain.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailServiceTest {
@Test
    public void EmailWasPlaced()
    {
        EmailService obj = new EmailService();
        Order obj2 = new Order();

        boolean result = obj.sendEmail(obj2,"Abhishek");

        assertTrue(result);

    }

}
