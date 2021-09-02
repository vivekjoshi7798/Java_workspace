import java.time.*;
import java.util.*;
public class Solution{
    public static void main(String argd[])
    {
            ZoneId ID = ZoneId.systemDefault();
            System.out.println(ID);

            ZoneId ID1 = ZoneId.of("America/Los_Angeles");
            ZonedDateTime Zte =ZonedDateTime.now(ID1) ;
            System.out.println(Zte);
    }
}