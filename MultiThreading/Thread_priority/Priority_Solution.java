class Mythread extends Thread
{


    public void run() {
    
        System.out.println("Child Thread Priority and name : " +Thread.currentThread().getName()+ ", " + Thread.currentThread().getPriority()) ;
        // Thread.yield();
        Thread.currentThread().setPriority(10);
        System.out.println(" Child Thread Priority and name : " +Thread.currentThread().getName()+ ", " + Thread.currentThread().getPriority()) ;
       
        for(int i=0 ;i<10;i++)
        {
            System.out.println("Print Run Threads" + i);
        }
    
    }
}
public class Priority_Solution {
    public static void main(String[] args) {
        // System.out.println("yeild method called");
        Mythread t1=new Mythread();
        t1.start();
        System.out.println("Parent  Thread Priority and name : " +Thread.currentThread().getName()+ ", " + Thread.currentThread().getPriority()) ;
    for(int i=0 ;i<10;i++)
    {
        System.out.println("Print main Threads" + i);
    }
    }
}
