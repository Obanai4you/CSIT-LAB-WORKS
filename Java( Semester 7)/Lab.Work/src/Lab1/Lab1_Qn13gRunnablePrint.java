package Lab1;

class Num implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}
public class Lab1_Qn13gRunnablePrint {
      public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Num());
        t.start();
        t.join();  // wait for thread to finish
       
       System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
}
