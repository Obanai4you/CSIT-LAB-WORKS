package Lab1;

public class Lab1_Qn13gThreadPrint extends Thread {

    @Override
    public void run() {
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Lab1_Qn13gThreadPrint t = new Lab1_Qn13gThreadPrint();

        t.start();   // start thread
        t.join();    // wait until thread finishes

        System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
}