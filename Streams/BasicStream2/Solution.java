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
        // it is works as predicate but when  it return false it Stop Excecution.
        Al.stream().takeWhile(i->i<5).forEach(System.out::print);
        System.out.println("\n");
        Al.stream().dropWhile(i-> !(i%2==0 && i>2) ).forEach(System.out::print);
        System.out.println("\n");
        Stream.iterate(1,x->x+1).limit(10).forEach(System.out::print);
        System.out.println("\n");
        Stream.iterate(1,x-> x<10,x->x+1).forEach(System.out::print);

        ArrayList<String> Al2= new ArrayList<String>();
       Al2.add("A");
       Al2.add(null);
       Al2.add("B");
       Al2.add("C");
       Al2.add("D");
       Al2.add("E");
       Al2.add(null);

        System.out.println("\n"+Al2);
        List<String> L  = Al2.stream().flatMap(i -> Stream.ofNullable(i)).collect(Collectors.toList());
        System.out.println(L);

    }
}

