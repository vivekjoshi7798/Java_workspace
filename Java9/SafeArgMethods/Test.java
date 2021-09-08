import java.util.*;
public class Test
{
    public static void main(String Args[])
    {
    List<String> name = Arrays.asList("Ram","Sham");
    List<String> City = Arrays.asList("Rahuri","Pune");
    display(name,City);
    }
    @SafeVarargs
    public static void display(List<String>... L)
    {
            System.out.println(L);
    }


}