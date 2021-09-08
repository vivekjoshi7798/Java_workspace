import java.util.*;
import java.util.stream.*;
public class Solution
{
    public static void main(String args[])
    {
        ArrayList<Integer> Al= new ArrayList<Integer>();

        for(int i=0; i<10 ;i++)
        {
            Al.add(Integer.valueOf(i));
        }

        List<Integer> S = Al.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("\n ---- Original List ---- " + Al + "\n ---- Modified List ---- " + S + "\n  ---- Map Operations ----");

        List<Integer> mapList = Al.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(" ---- Original List ---- " + Al + "\n ---- Modified mapList ---- " + mapList+ "\n  ---- Flat Map Operations ----");

        List<Integer> mapFlatList = Al.stream().flatMap(i-> {
            if (i%2==0) 
                return Stream.of(i); 
            else 
                return Stream.of(i,i*i);
            
            }).collect(Collectors.toList());
        System.out.println(mapFlatList);
    }
}

