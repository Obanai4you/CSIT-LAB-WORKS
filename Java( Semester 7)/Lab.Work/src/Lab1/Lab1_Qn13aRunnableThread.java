
package Lab1;
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Thread");
    }
}

public class Lab1_Qn13aRunnableThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyRunnable());
        t.start();
        t.join();
        
         System.out.println("\nLab1,Priyanshu Shrestha,23081040");
     } 
}
