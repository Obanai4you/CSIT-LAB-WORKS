
package Lab1;
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Class");
    }
}
public class Lab1_Qn13bThreadClass {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();
        
       System.out.println("\nLab1,Priyanshu Shrestha,23081040");
    }
}
