package Lab1;

// Shared resource class
class TableSync {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + (n * i));
        }
    }
}

// Thread class (renamed to avoid conflicts)
class TableThreadDemo extends Thread {
    TableSync table;
    int number;

    TableThreadDemo(TableSync table, int number) {
        this.table = table;
        this.number = number;
    }

    @Override
    public void run() {
        table.printTable(number);
    }
}

// Main class
public class Lab1_Qn13eSynchronizedMethod {
    public static void main(String[] args) throws InterruptedException {

        TableSync table = new TableSync();

        TableThreadDemo t1 = new TableThreadDemo(table, 5);
        TableThreadDemo t2 = new TableThreadDemo(table, 10);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
}