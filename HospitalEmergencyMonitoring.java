class EmergencyAlert extends Thread {

    public EmergencyAlert() {
        super("EmergencyAlert");
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                "Thread: " + getName() +
                " | Priority: " + getPriority() +
                " | Activity: Critical patient alert"
            );
        }
    }
}

class VitalMonitor extends Thread {

    public VitalMonitor() {
        super("VitalMonitor");
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                "Thread: " + getName() +
                " | Priority: " + getPriority() +
                " | Activity: Checking vital signs"
            );
        }
    }
}

class ReportGenerator extends Thread {

    public ReportGenerator() {
        super("ReportGenerator");
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                "Thread: " + getName() +
                " | Priority: " + getPriority() +
                " | Activity: Generating routine report"
            );
        }
    }
}

public class HospitalEmergencyMonitoring {

    public static void main(String[] args) {

        EmergencyAlert emergency = new EmergencyAlert();
        VitalMonitor vital = new VitalMonitor();
        ReportGenerator report = new ReportGenerator();

        // Assign priorities
        emergency.setPriority(Thread.MAX_PRIORITY);   // 10
        vital.setPriority(Thread.NORM_PRIORITY);      // 5
        report.setPriority(Thread.MIN_PRIORITY);      // 1

        // Start all threads
        emergency.start();
        vital.start();
        report.start();
    }
}