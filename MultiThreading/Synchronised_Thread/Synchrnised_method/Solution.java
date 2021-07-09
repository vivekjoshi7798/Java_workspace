// If you declare any method as synchronized, it is known as synchronized method.
// Synchronized method is used to lock an object for any shared resource.

class displayTable {
    
    public synchronized void PrintData(int N)
    {
            for (int i = 1; i <= 10; i++) {
                System.out.println( N*i);

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    //TODO: handle exception
                }
            }
    }

   
   
}
class Mythread1 implements Runnable
{

    displayTable d1;
    public Mythread1(displayTable d1)
    {

        this.d1=d1;
    }
    @Override
    public void run() {
        
        d1.PrintData(5);
    }

}

class Mythread2 implements Runnable
{
    displayTable d1;
    public Mythread2(displayTable d1)
    {

        this.d1=d1;
    }

    @Override
    public void run() {
        d1.PrintData(100);
        
    }

}


public class Solution {
 public static void main(String[] args) {
    displayTable d1 =new displayTable(); 
    Mythread1 m1  = new Mythread1(d1);
    Mythread2 m2  = new Mythread2(d1);
    Thread t1 =new Thread(m1);
    Thread t2 =new Thread(m2);
    t1.start();
    t2.start();
 }    
}

/*
befire  Synchrnised method
sai@sai-Aspire-E1-571:~/Documents/Java_workspace/MultiThreading/Synchronised_Thread/Synchrnised_method$ java Solution 
5
100
10
200
15
300
20
400
25
500
30
600
35
700
40
800
45
900
50
1000
sai@sai-Aspire-E1-571:~/Documents/Java_workspace/MultiThreading/Synchronised_Thread/Synchrnised_method$ javac Solution.java 

After Synchrnised method 
sai@sai-Aspire-E1-571:~/Documents/Java_workspace/MultiThreading/Synchronised_Thread/Synchrnised_method$ java Solution 
5
10
15
20
25
30
35
40
45
50
100
200
300
400
500
600
700
800
900
1000

*/