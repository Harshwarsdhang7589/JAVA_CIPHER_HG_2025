package QD1;
/*
Total available tickets = 10
Each counter (thread) requests random tickets (1 to 4)
Booking should follow these rules:
If requested tickets ≤ available tickets -- booking allowed
If requested tickets > available tickets  -- booking rejected
Once tickets reach 0, all remaining threads must stop booking
Print clear booking result for each counter:
Tickets requested
Tickets booked / rejected
Remaining tickets


 Priority Counters:
Some counters (e.g. VIP counters) get tickets first.
-- Threads with higher priority book first.

Waiting Queue for Customers:
If tickets aren’t available now, the customer waits for next available tickets (simulates waitlist).

Partial Booking & Retry:
If a counter tries to book 2 tickets but only 1 is available, it books 1 and stops, instead of failing completely.

Dynamic Counters:
Add random counters joining or leaving while tickets are being booked.

Ticket Cancellation & Rebooking:
A thread may cancel a booked */

import java.util.*;

class Counter implements Runnable
 {
    private TicketBookingSystem bookingSystem;
    private String counterName;
    private int counterPriority;
    private boolean isVIP;
    
    public Counter(TicketBookingSystem system, String name, int priority, boolean isVIP) {
        this.bookingSystem = system;
        this.counterName = name;
        this.counterPriority = priority;
        this.isVIP = isVIP;
    }
    
    @Override
    public void run() {
        Random random = new Random();
        int attempts = random.nextInt(3) + 1; // Each counter tries 1-3 times
        
        for (int i = 0; i < attempts; i++) {
            if (bookingSystem.isSystemClosed()) {
                System.out.println(counterName + " - System closed, stopping operations");
                break;
            }
            
            int requestedTickets = random.nextInt(4) + 1; // Request 1-4 tickets
            bookingSystem.bookTickets(counterName, requestedTickets, isVIP);
            
            try {
                Thread.sleep(random.nextInt(100) + 50); // Simulate processing time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
    
    public String getCounterName() {
        return counterName;
    }
    
    public int getCounterPriority() {
        return counterPriority;
    }
}

class TicketBookingSystem {
    private int availableTickets;
    private final int TOTAL_TICKETS;
    private boolean systemClosed = false;
    private List<WaitingCustomer> waitingQueue = new ArrayList<>();
    
    public TicketBookingSystem(int totalTickets) {
        this.TOTAL_TICKETS = totalTickets;
        this.availableTickets = totalTickets;
    }
    
    // Basic synchronized method for booking tickets
    public synchronized void bookTickets(String counterName, int requestedTickets, boolean isVIP) {
        String prefix = isVIP ? "[VIP] " : "[Regular] ";
        
        // Check if system should close
        if (availableTickets <= 0) {
            systemClosed = true;
            System.out.println(prefix + counterName + " - REJECTED: System closed (0 tickets remaining)");
            return;
        }
        
        // VIP priority booking
        if (isVIP) {
            System.out.println(prefix + counterName + " - Processing with PRIORITY");
        }
        
        System.out.println(prefix + counterName + " - Requested: " + requestedTickets + " tickets");
        
        // Full booking if enough tickets available
        if (requestedTickets <= availableTickets) {
            availableTickets -= requestedTickets;
            System.out.println(prefix + counterName + " - BOOKED: " + requestedTickets + " tickets");
            System.out.println(prefix + counterName + " - Remaining: " + availableTickets + " ticket");
        }
        }
