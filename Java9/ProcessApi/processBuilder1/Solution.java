public class Solution
{
    public static void main(String Args[]) throws Exception
    {
      ProcessBuilder P = new ProcessBuilder("notepad.exe","abc.txt");
       Process P1 =  P.start();
        Thread.sleep(10000);
        P1.destroy();

    }
}