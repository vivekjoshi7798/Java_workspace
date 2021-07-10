import java.lang.Thread;

class Mythread extends Thread
{

    @Override
    public void run() {
       for (int i = 0; i < 10; i++) {
        System.out.println(" thread Demon "+Thread.currentThread().isDaemon());
           System.out.println("Child threads Class Excecutted");
       }
    }
}
public class Solution {

    public static void main(String[] args) throws InterruptedException {
    
            Mythread m1 = new Mythread();
            m1.setDaemon(true);    
            m1.start();
            
            for (int i = 0; i < 10; i++) {
            
                System.out.println("parent threads Class Excecutted");
                Thread.sleep(10);
            }    
    }

}


/*
sai@sai-Aspire-E1-571:~/Documents/Java_workspace/MultiThreading/Demon_Thread$ java Solution
parent threads Class Excecutted
parent threads Class Excecutted
parent threads Class Excecutted
parent threads Class Excecutted
parent threads Class Excecutted
parent threads Class Excecutted
parent threads Class Excecutted
 thread Demon true
Child threads Class Excecutted
 thread Demon true
Child threads Class Excecutted
 thread Demon true
Child threads Class Excecutted
 thread Demon true
Child threads Class Excecutted
 thread Demon true
Child threads Class Excecutted
 thread Demon true
Child threads Class Excecutted
 thread Demon true
Child threads Class Excecutted
 thread Demon true
Child threads Class Excecutted
 thread Demon true
Child threads Class Excecutted
 thread Demon true
Child threads Class Excecutted
parent threads Class Excecutted

parent threads Class Excecutted
parent threads Class Excecutted
sai@sai-Aspire-E1-571:~/Documents/Java_workspace/MultiThreading/Demon_Thread$ 

*/