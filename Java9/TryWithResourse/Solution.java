import java.io.*;
class Solution
{
    public static void main(String Args[]) throws FileNotFoundException,IOException
    {
        try( BufferedReader br = new BufferedReader(new FileReader("abc.txt")))
        {
            String name=br.readLine();
            System.out.println(name);

        }

    }
}