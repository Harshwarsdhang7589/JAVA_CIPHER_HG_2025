package QD1;

public class MainThread {
    public static void main(String[] args) {
        // Create shared ticket counter with 10 total tickets
        TicketCounter counter = new TicketCounter(10);
        
        // Create booking threads
        BookingThread vip = new BookingThread(3, counter, "VIP Counter");
        BookingThread counter1 = new BookingThread(5, counter, "Counter1");
        BookingThread counter2 = new BookingThread(5, counter, "Counter2");
        
        // Mark VIP thread as priority
        counter.setVipInProgress(true);
        
        // Start all threads
        vip.start();
        counter1.start();
        counter2.start();
        
        try {
            // Wait for all threads to complete
            vip.join();
            counter1.join();
            counter2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\n========================================");
        System.out.println("All booking completed");
        System.out.println("========================================");
        
        // Check if threads are still alive
        System.out.println("\nVIP ALIVE? " + vip.isAlive());
        System.out.println("Counter1 ALIVE? " + counter1.isAlive());
        System.out.println("Counter2 ALIVE? " + counter2.isAlive());
        
        System.out.println("\nFINAL MESSAGE: ALL BOOKINGS ARE DONE");
        System.out.println("MAIN THREAD WAITED UNTIL ALL BOOKING THREADS FINISHED EXECUTION");
    }
}
