class TrafficMonitor extends Thread {

    private String status;

    TrafficMonitor(String name, String status) {
        setName(name);
        this.status = status;
    }

    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                Thread.currentThread().getName()
                + " -> Traffic Status: "
                + status
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

public class SmartTrafficManagement {

    public static void main(String[] args) {

        TrafficMonitor t1 =
            new TrafficMonitor("Junction 1", "Heavy Traffic");

        TrafficMonitor t2 =
            new TrafficMonitor("Junction 2", "Normal Traffic");

        TrafficMonitor t3 =
            new TrafficMonitor("Junction 3", "Low Traffic");

        t1.start();
        t2.start();
        t3.start();
    }
}