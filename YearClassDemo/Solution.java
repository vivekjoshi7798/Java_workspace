
import java.time.*;
import java.util.*;

public class Solution{
    public static void main(String argd[])
    {
            Scanner SC = new Scanner(System.in);
            int YY = SC.nextInt();
            Year Y=Year.of(YY);
            if(Y.isLeap())
                {
                       System.out.println("Year is leap"); 
                }
                else{
                        System.out.println("Year is not leap");
                }
    }
}