import java.time.*;

public class Solution{
    public static void main(String argd[])
    {
            LocalDate LD = LocalDate.now();
            LocalTime LT = LocalTime.now();
            System.out.println("Local_Date : "+ LD+  " \nLocal Time : "+ LT );

            int DD = LD.getDayOfMonth();
            int MM= LD. getMonthValue();
            int YYYY = LD.getYear();
            int hour =LT.getHour();
            int min = LT.getMinute();
            int sec = LT.getSecond();
            int nano = LT.getNano();
            System.out.println(DD);
            System.out.println(MM);
            System.out.println(YYYY);

            System.out.println("\nhour : "+hour+ "\nminute : "+min + "\nSeconds  : "+ sec + "\nnano : "+nano);


    }
}