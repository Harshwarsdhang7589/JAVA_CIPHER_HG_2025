package QD1;

public class TicketCounter {
    private int availableTickets;
    private int ticketNumber = 1; // Ticket number generator (unique ticket number)
    private boolean vipInProgress = false; // Flag to indicate VIP booking is in progress
    
    // Constructor initializes total available tickets
    public TicketCounter(int totalTickets) {
        this.availableTickets = totalTickets;
    }
    
    public void setVipInProgress(boolean vipInProgress) {
        this.vipInProgress = vipInProgress;
    }
    
    // Synchronized method ensures only one thread can execute at a time
    public synchronized void bookTickets(String counterName, int requestedTickets) {
        // Normal counters wait while VIP booking is in progress
        if (!counterName.equals("VIP Counter")) {
            while (vipInProgress) {
                try {
                    System.out.println("[" + counterName + "] waiting for VIP booking to complete...");
                    wait(); // Wait until VIP finishes
                } catch (InterruptedException e) {
                    System.out.println("[" + counterName + "] interrupted while waiting");
                    e.printStackTrace();
                }
            }
        }
        
        // Check ticket availability
        if (availableTickets == 0) {
            System.out.println("[" + counterName + "] NO TICKETS AVAILABLE!");
            return;
        }
        
        // Logic for partial booking - allow booking of available tickets
        int ticketsToBook;
        if (requestedTickets <= availableTickets) {
            ticketsToBook = requestedTickets;
        } else {
            ticketsToBook = availableTickets;
            System.out.println("[" + counterName + "] Only " + ticketsToBook + " tickets available (requested " + requestedTickets + ")");
        }
        
        // Actual booking process
        System.out.println("|" + counterName + "| Booking " + ticketsToBook + " tickets...");
        for (int i = 0; i < ticketsToBook; i++) {
            System.out.println("  |" + counterName + "| Booked Ticket " + ticketNumber);
            ticketNumber++; // Increment ticket number for next booking
            availableTickets--; // Decrease available tickets
            
            try {
                Thread.sleep(400); // Simulate real-time booking delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Display booking details
        System.out.println("[" + counterName + "] Booking done | Remaining tickets: " + availableTickets);
        
        // If VIP booking ends, notify all waiting normal counters
        if (counterName.equals("VIP Counter")) {
            vipInProgress = false;
            notifyAll(); // Wake up all waiting threads
            System.out.println("[" + counterName + "] VIP booking complete - notifying other counters");
        }
    }
}
