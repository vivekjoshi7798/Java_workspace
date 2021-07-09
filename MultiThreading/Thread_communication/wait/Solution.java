public class Solution
{
    public static void main(String[] args) throws InterruptedException{
        Mythread m1 =new Mythread();
        m1.start();
        synchronized(m1)
        {
            for (int i = 0; i < 5; i++) {
                System.out.println( "parent Thread " + i);
                Thread.sleep(1000);
                 if (i==2)
                 m1.wait();
            }
        }
    }
} 

class Mythread extends Thread
{
    @Override
    public void run() {    
        synchronized(this)
        {
            for (int i = 0; i < 10; i++) {
                System.out.println( "Child Thread " + i);
            }
        this.notify();
        }
    }
}