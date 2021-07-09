import java.lang.Thread;

class Mythread extends Thread
{

    @Override
    public void run() {
       for (int i = 0; i < 10; i++) {
           System.out.println("Child threads Class Excecutted");
       }
    }
}
public class Solution {

    public static void main(String[] args) {
    
            Mythread m1 = new Mythread();
            m1.start();

            for (int i = 0; i < 10; i++) {
                System.out.println("parent threads Class Excecutted");
            }    
    }

}
