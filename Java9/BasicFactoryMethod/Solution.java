import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        List<String> L = new ArrayList<String>();
        for(int i=70;i<80;i++)
        {
            L.add(new String().valueOf((char)i));
        }
        List<String> L1=Collections.unmodifiableList(L);
        System.out.println(L1);

        Set<String> S = new HashSet<String>();
        for(int i=70;i<80;i++)
        {
            S.add(new String().valueOf((char)i));
        }
        Set<String> S1 = Collections.unmodifiableSet(S);
         System.out.println(S1);


        
    }
}