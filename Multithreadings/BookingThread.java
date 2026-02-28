package QD1;

public class BookingThread extends Thread {
    private int requestedTickets;
    private TicketCounter counter;
    private String counterName;
    
    // Constructor initializes required values
    public BookingThread(int requestedTickets, TicketCounter counter, String counterName) {
        this.requestedTickets = requestedTickets;
        this.counter = counter;
        this.counterName = counterName;
        setName(counterName); // Set thread name
    }
    
    @Override
    public void run() {
        // Log when thread starts execution
        System.out.println("\n[" + getName() + "] started booking process");
        System.out.println("[" + getName() + "] requesting " + requestedTickets + " tickets");
        
        // Call synchronized booking method
        counter.bookTickets(counterName, requestedTickets);
        
        System.out.println("[" + getName() + "] booking process completed\n");
    }
}
