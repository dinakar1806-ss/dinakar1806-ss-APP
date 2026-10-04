class OrderProcessing extends Thread {

    public OrderProcessing() {
        super("OrderProcessing");
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                "Thread: " + getName() +
                " | Priority: " + getPriority() +
                " | Activity: Processing customer order"
            );
        }
    }
}

class DeliveryTracking extends Thread {

    public DeliveryTracking() {
        super("DeliveryTracking");
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                "Thread: " + getName() +
                " | Priority: " + getPriority() +
                " | Activity: Tracking delivery location"
            );
        }
    }
}

class Notification extends Thread {

    public Notification() {
        super("Notification");
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                "Thread: " + getName() +
                " | Priority: " + getPriority() +
                " | Activity: Sending order notification"
            );
        }
    }
}

public class FoodDeliverySystem {

    public static void main(String[] args) {

        OrderProcessing order = new OrderProcessing();
        DeliveryTracking delivery = new DeliveryTracking();
        Notification notification = new Notification();

        // Assign different priorities
        order.setPriority(Thread.MAX_PRIORITY);       // 10
        delivery.setPriority(Thread.NORM_PRIORITY);   // 5
        notification.setPriority(Thread.MIN_PRIORITY); // 1

        // Start all threads
        order.start();
        delivery.start();
        notification.start();
    }
}