class  Mythread implements Runnable
{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runnable Class Excecutted");
        }    
        
    }
}

public class Solution {

    public static void main(String[] args) {
    
        Mythread m1 =new Mythread();
        Thread t1 =new Thread(m1);
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("parent threads Class Excecutted");
        }    

    }
    
    
}
