import java.text.DateFormat;
import java.util.*;

public class nine
{
    public static void main(String args[])
    {
        Date d = new Date();
        System.out.println("Today's date is-"+d.toString());
        Locale locItalian = new Locale("it","ch");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
        System.out.println("Today's date in Italian language and Switzerland format is-"+df.format(d));

    }
}
