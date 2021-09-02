
import java.time.*;

public class Solution{
    public static void main(String argd[])
    {
        LocalDateTime LDT = LocalDateTime.of(1996,9,26,12,30,30);
        System.out.println(LDT);
        System.out.println("Value Befoer 6 years "+LDT.minusYears(6)+"\nValue after  6 years "+LDT.plusYears(6));
        
        System.out.println("Value Befoer 6 Months "+LDT.minusMonths(6)+"\nValue after  6 Months "+LDT.plusMonths(6));

        System.out.println("Value Befoer 6 Days "+LDT.minusDays(6)+"\nValue after  6 Days "+LDT.plusDays(6));
    }
}