import  java.util.*;
import static  java.util.Map.entry;
public class Solution
{
    public static void main(String args[])
    {
        List<String> L1 = List.of("A","B","C","D");
        System.out.println(L1);

        Set<String> S1 = Set.of("A","B","C","D");
        System.out.println(S1);

        // by creating saperate Entry Object 
        Map.Entry<Integer,String> M1 = Map.entry(1,"Raja");
        Map.Entry<Integer,String> M2 = Map.entry(2,"Vivek");
        Map.Entry<Integer,String> M3= Map.entry(3,"Matesh");
        Map.Entry<Integer,String> M4= Map.entry(4,"Ram");
        Map.Entry<Integer,String> M5= Map.entry(5,"Sham");
        Map.Entry<Integer,String> M6= Map.entry(6,"Gita");
        Map<Integer,String> m2 = Map.ofEntries(M1,M2,M3,M4,M5,M6);
        System.out.println(m2);

        // by creating Single map and Implic Entry Object  
        Map<Integer,String> Student = Map.ofEntries(entry(1,"rama"),entry(2,"Sham"),entry(3,"Gyan"),entry(4,"Sita"),entry(5,"Gita"),entry(6,"Rakesh"));
        System.out.println(Student);
    }
}