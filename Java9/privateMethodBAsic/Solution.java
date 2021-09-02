import java.util.*;
interface Sample 
{
    default void m1()
    {
        m3();
        m2();
    }
    default void m2()
    {
        m3();
    }
    private void m3()
    {
        System.out.println("Common Java Function");
    }

    static void d1()
    {
        System.out.println("Common Java static  method");
    }

}

class Solution implements Sample
{
    public static void main(String argd[])
    {
            Solution S = new Solution();
            S.m1();
            Sample.d1();
    }
}