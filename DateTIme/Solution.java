
import java.time.*;

public class Solution{
    public static void main(String argd[])
    {
            LocalDateTime LDT = LocalDateTime.now();
            System.out.println("Local_Date : "+ LDT );

            int DD = LDT.getDayOfMonth();
            int MM= LDT. getMonthValue();
            int YYYY = LDT.getYear();
            int hour =LDT.getHour();
            int min = LDT.getMinute();
            int sec = LDT.getSecond();
            int nano = LDT.getNano();
            System.out.println(DD);
            System.out.println(MM);
            System.out.println(YYYY);

            System.out.println("\nhour : "+hour+ "\nminute : "+min + "\nSeconds  : "+ sec + "\nnano : "+nano);
    }
}