public class Solution
{
    public static void main(String Args[])
    {
       ProcessHandle Handle = ProcessHandle.current();
        System.out.println(Handle.pid());

    }
}