package Lab1;

public class Lab1_Qn13dPriority extends Thread {

    @Override
    public void run() {
        System.out.println("Thread Priority: " + getPriority());
    }

    public static void main(String[] args) throws InterruptedException {

        Lab1_Qn13dPriority t = new Lab1_Qn13dPriority();

        t.setPriority(8);  // set thread priority
        t.start();

        t.join();  // wait for thread to finish

      System.out.println("\nLab1,Priyanshu Shrestha,23081040");
    }
}