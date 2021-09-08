class MyGenerics<T>
{
    T t;

    public void  set(T t)
    {
        this.t=t;
    }
    public T get()
    {
        return this.t;
    }

    public void  process()
    {
        System.out.println("Java Methods Process");
    }
    MyGenerics(T t)
    {
            this.t=t;
    }

}

public class Solution
{
    public static void main(String args[])
    {
            MyGenerics<String> myobj = new MyGenerics<String>("Rajecsh")
            {
                public void  process()
                {
                    System.out.println("Java Methods Process "+get());
                }
            };
            myobj.process();

            MyGenerics<String> myobj1 = new MyGenerics<String>("Girish")
            {
                public void  process()
                {
                    System.out.println("Java Methods Process "+get());
                }
            };
            myobj1.process();
    }
} 