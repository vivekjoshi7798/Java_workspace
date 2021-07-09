import java.util.List;
import java.util.Stack;

class MyThread implements Runnable
{
 
    Stack S = new Stack<Integer>();
    Integer I = (Integer) 10;


    @Override
    public void run() {

        S.push(I);
        for (int i = 0; i < 10; i++) {
            System.out.println( "Product added To cart " + i);
            S.push(i);
        }

        // TODO Auto-generated method stub
        
    }
}


public class Join_Solution {
public static void main(String[] args) throws InterruptedException {
    
    MyThread s1= new MyThread();
    Thread t1 =new Thread(s1);

    t1.start();
    
    for (int i = 0; i < 10; i++) {

        if (s1.S.isEmpty())
        t1.join();
        else
        System.out.println( "prodct  has been sell" + s1.S.pop());       
    }

}    
}

