import java.util.*;
public class Solution{
    public static void main(String argd[])
    {
        Scanner S = new Scanner(System.in);
        int X = S.nextInt();
        List<Integer> L1 = new  ArrayList<Integer>();
        List<Integer> max = new  ArrayList<Integer>();
        for(int i =0; i<10;i++)
        {
            L1.add(i+1);
        }
        for(int i =0; i<(L1.size()-X)+1;i++)
        {
            System.out.println(L1.subList(i,i+X));
         max.add(Collections.min(L1.subList(i,i+X)));
        }
        

        System.out.println(Collections.max(max));


    }

}      