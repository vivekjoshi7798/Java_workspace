class Mythread implements Runnable
{
    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread" );
           
            // // try {
            //     // Thread.sleep(5000);    
            // } catch (InterruptedException e) {
            //     Thread.currentThread().interrupt();
            // }
            
        } 
    }

}
public class Sleep_Solution {
    public static void main(String[] args) {
    
        Mythread m1 =new Mythread();
        Thread t1 =new Thread(m1);
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Parent Thread" );
        }

    }
}
