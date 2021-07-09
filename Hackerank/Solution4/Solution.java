import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Date date= new Date();
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        String[] days = new String[] { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
   
        return days[c.get(c.DAY_OF_WEEK) - 1];

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        
        Scanner SC =new Scanner(System.in);
        int month= SC.nextInt() ;
        int day= SC.nextInt() ;
        int year= SC.nextInt() ;


        String res = Result.findDay(month, day, year);

        System.out.println(res);
       
    }
}
