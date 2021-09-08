public class Solution
{
    public static void main(String args[])
    {
        Solution S = new Solution();
           System.out.println(S.add(10,20,30));
    }

    public int add(int... i)
    {
        return sum(i);
    }

    public int sum(int a[])
    {
        int sum=0;
        for(int x :a) 
        {
            sum=sum+x;
        }
        return sum;

    }
} 