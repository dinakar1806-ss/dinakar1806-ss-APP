class BankingTask implements Runnable {

    private String activity;

    BankingTask(String activity) {
        this.activity = activity;
    }

    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                Thread.currentThread().getName()
                + " -> " + activity
                + " | Execution: " + i
            );

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class BankingApplication {

    public static void main(String[] args) {

        Thread t1 = new Thread(
            new BankingTask("Transaction Processing")
        );

        Thread t2 = new Thread(
            new BankingTask("Balance Updating")
        );

        Thread t3 = new Thread(
            new BankingTask("Sending SMS Notification")
        );

        t1.setName("Transaction Thread");
        t2.setName("Balance Thread");
        t3.setName("SMS Thread");

        t1.start();
        t2.start();
        t3.start();
    }
}