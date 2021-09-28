import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
public class date
{
    public static void main(String args[])
    {
        DateTimeFormatter datetime = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(datetime.format(now));
    }
}
