// synchronized block can be used to perform synchronization on any specific 
// resource of the method.

// Suppose you have 50 lines of code in your method,
//  but you want to synchronize only 5 lines, you can use synchronized block.

// If you put all the codes of the method in the synchronized block, 
// it will work same as the synchronized method.

class displayTable {
    
    public void PrintData(int N)
    {
        
            for (int i = 1; i <= 10; i++) {
                System.out.println(N*i);
                try
                {

                }
                catch(Exception E)
                {{

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


