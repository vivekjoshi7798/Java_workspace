class Mythread implements Runnable
{
 @Override
 public void run() {
    
    for (int i = 0; i < 10; i++) {
        System.out.println("Hello  China "+Thread.currentThread().getName() );
    }
 }
}
public class Solution {
public static void main(String[] args) {
    
    Mythread mr =new Mythread();
    Thread tr =new Thread(mr);
    tr.start();
    tr.setName("Child Thread");
    Thread.currentThread().setName("Main Thread");
    for (int i = 0; i < 10; i++) {
        System.out.println("Hello  India "+Thread.currentThread().getName());
    }
    

}
    
}
