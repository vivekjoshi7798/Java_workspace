import java.util.*;
public class Solution
{
    public static void main(String Args[])
    {
       Optional<ProcessHandle> opt = ProcessHandle.of(7728);
       ProcessHandle P = opt.get();
       P.destroy();
    }
}