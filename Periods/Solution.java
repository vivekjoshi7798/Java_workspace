
import java.time.*;

public class Solution{
    public static void main(String argd[])
    {
        LocalDate LD = LocalDate.of(1996,9,26);
        LocalDate Current  = LocalDate.now();
        Period P = Period.between(Current,LD);
        System.out.println(P.getYears()+"/"+P.getDays()+"/"+P.getMonths());

        // Calculate Days of Death
        LocalDate LD1 = LocalDate.of(1996+60,9,26);
        Period P1 = Period.between(Current,LD1);
        System.out.println( "Number of Days you on this EArth  : " + ((P.getYears()*365)+(P.getDays()*30)+P.getMonths()));

        
    
    }
}