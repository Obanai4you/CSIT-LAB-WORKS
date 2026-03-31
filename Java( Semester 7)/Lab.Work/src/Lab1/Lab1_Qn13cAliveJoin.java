package Lab1;

class C extends Thread {
    public void run() {
        System.out.println("Running");
    }
}
public class Lab1_Qn13cAliveJoin {
    public static void main(String[] args) throws Exception {
        C t = new C();
        t.start();
        t.join();
        System.out.println(t.isAlive());
          
       System.out.println("\nLab1,Priyanshu Shrestha,23081040");
    }
    
}
