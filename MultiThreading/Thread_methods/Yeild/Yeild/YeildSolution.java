class Mythread extends Thread
{


    public void run() {
    
        Thread.yield();
        System.out.println("Child Thread Priority and name : " +Thread.currentThread().getName()+ ", " + Thread.currentThread().getPriority()) ;
        for(int i=0 ;i<10;i++)
        {
            System.out.println("Print Run Threads : " + i);
        }
    
    }
}
public class YeildSolution {
    public static void main(String[] args) {
       Mythread t1=new Mythread();
        t1.start();
        Thread.currentThread().setPriority(10);
        System.out.println("Parent  Thread Priority and name : " +Thread.currentThread().getName()+ ", " + Thread.currentThread().getPriority()) ;
    for(int i=0 ;i<10;i++)
    {
        System.out.println("Print main Threads : " + i);
    }
    }
}
