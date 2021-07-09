class Mythread implements Runnable
{
    @Override
    public void run() {
    
        for (char s : "Vivek")
        {
                System.out.println(s);
        }
     
    }
   
}

public class Solution {

    public static void main(String[] args) {
        Mythread s =new Mythread();
        Thread t1 =new Thread(s);
    
        t1.start();    
    }
    

}
