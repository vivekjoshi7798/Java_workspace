import java.util.*;
public class Solution
{
    public static void main(String Args[])
    {
        Optional<ProcessHandle> opt = ProcessHandle.of(10436);
        ProcessHandle Handle = opt.get();
        ProcessHandle.Info info = Handle.info();
        System.out.println("Information " + info);
        System.out.println("\n--- Current Process ID-- "+ Handle.pid());
        System.out.println("\n -- User ---"+info.user().get() );
        System.out.println("\n -- Command ---"+ info.command().get());
        System.out.println("\n -- Start Time --"+info.startInstant().get());
        System.out.println("\n -- CPU Utilisations Time --"+info.totalCpuDuration().get());
    }
}


