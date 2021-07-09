class Demo
{
    public synchronized void  wish (String name)
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome : ");
       
        try
        {
        Thread.sleep(100);
        }
        catch(Exception e)
        {
            System.out.println("Exception occured");
        }
        System.out.println(name);
        }
    }
}
class mythread extends Thread
{
    Demo d;
    String name;
    mythread(Demo d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.wish(name);
    }
}

public class Solution_Single_object
{
    public static void main(String[] args) {
        System.out.println("Hello_World");
    Demo d =new Demo();
    mythread m1=new mythread(d, "dhoni");
    mythread m2=new mythread(d, "sachine");
    m1.start();
    m2.start();

    }
}