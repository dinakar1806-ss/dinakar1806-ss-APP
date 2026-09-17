class ExamTask implements Runnable {

    private String activity;

    ExamTask(String activity) {
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

public class OnlineExam {
    public static void main(String[] args) {

        Thread t1 = new Thread(
            new ExamTask("Displaying remaining time")
        );

        Thread t2 = new Thread(
            new ExamTask("Auto-saving student's answers")
        );

        Thread t3 = new Thread(
            new ExamTask("Checking network connection")
        );

        t1.setName("Timer Thread");
        t2.setName("AutoSave Thread");
        t3.setName("Network Thread");

        t1.start();
        t2.start();
        t3.start();
    }
}