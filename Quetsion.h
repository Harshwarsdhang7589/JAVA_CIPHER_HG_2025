/*
package QD1;

import com.sun.net.httpserver.Request;
import com.sun.source.tree.SynchronizedTree;
import java.util.concurrent.PriorityBlockingQueue;

public class MainThread 
{
    public static void main(String [] args)
    {
        counter=new ticketCounter();
        BookingThread=vip;

        vip.start();// starts all thraeds
        counter1.start();
        vip.join();
        counter1.join();
        counter2.join();

        system.out.println("all booking completed"):
        // ***********CHECKING WHETHER STATE ARE STILL ALIVE**
        system.out.println("VIP ALIVE?:");
        vip.isalive();

        System.out.println("Counter1 ALIVE?" +counter1.isalive());// to check whether the  threads are used or is some threads are remained
        System.out.println("Counter2 ALIVE?" +counter2.isalive()); // VIP  counter request 3tickets each
            // Total 5 counter request tickets
            // shared resource :1 ticket counter used by all thread
        System.out.println("FINAL MESSAGE AFTER ALL BOOKINGS ARE DONE"); // normal counter request tickets

        system.out.println("MAIN THREAD WAIT UNTIL ALL BOOKING THREAD FINISHED EXECUTION");
        // normal counter request tickets

        // booking thread represent 1 booking booking countter :each object of tjhis c;ass runs 1 thread.Refrence to shared
        private ticketcounter Counter();
        {
            System.out.println("no of tickets this counter wants to book:");

        }
        bookingThread(ticketcounter.counter)
        {
        private  tickeRequested()
        {
            // consturctor initialiases required values:
            BookingThread (Int Requestedtickets,int Ticket counter)
            {
                this counter=counter;// tickets requested by this counter
                this.Requestedtickets=Requestedtickets;// setting thread name


            }

            counter.setCounterName();// runn method contains the task executed by th thread
            public void open();// log when thread starts execution and shared name  and when strted booking
            counter.getCounterName// calls Synchronised boooking method
            system.out.println("|" +getName()+)

            system.out.println( "|" bookingname() +"booking name");



            class ticketcounter
            {
                private int availableTickets;// ticket number generater(UNIQUE TICKET NUMBER)
                private int ticketnumber;
                // Constructor initialises total available tickets:

                ticketcounter(int TOTAL_TICKETS)
                {
                    this.availableTickets=total_Tickets;
                }
                // flag to indicate that the private vipo ticlkets are going on:
                private boolen Vipinprogress;
                // Synchronised method ensures o nly one thtrread can be exceures one thread at at time.
                public SynchronizedBookingTickets(String countername,int requestedTickets)
               {
                if(!countername.equals(vip.counter))
                {
                    while(Vipinprogress)
                    {

                    
                    // while loop prevents
                    // vip in progress


                    try(InterruptedException e)
                    {
                        System.out.println(" Interrupted while making:");
                    }
                    catch()
                    {

                    }
                //  the flag toioll normal will wait
                vip.equals();
                Vipinprogress();




                }
                // MULTILINE PROGRESS CHECK TICKET AVIALABILITY:
                if(availabletickets== 0)
                {
                    System.out.println("not tickets lefts");
                    System.out.println("counterName:" +noticketsavailable);


                }
                else
                {
                    // STRONG LOGIC FOR PARTIALS FOR BOOKING ALLOW
                    int ticketstoBook;// spot deceleartion
                    if(requestedTickets<=availableTickets)
                    {
                        ticketstoBook=requestedTickets;

                    }
                    else
                    {
                        ticketstoBook=availableTickets;
                        
                    }
                    // ACTUAL BOOKING PROCESS:
                    for(int i=0;i<ticketsbooked;i++)
                    {
                        // assigned t
                        system.out.println("colunter ticket"+bookedTicket.i);
                        // incremented ticket no for nexrt booking
                        ticketno++;
                        //ticket avialable tickets
                        // try simulate the realtime booking delay
                        thread.slip(400);
                        catch(InterruptedException e)
                        {
                            e.printStackTrace();//
                        }
                        
                    }
                    // display booking details:
                    System.out.println(" "counter name " +(bookingdone) | (remainingtickets)" + availabletickets);
                    // vip booking end;
                    // notify all waiting normal counters

                    
                    if(countername.equals(vip!=counter))
                    {
                    vipinprogress=false;
                    notifyall();// wakeup waiting threads
                    }
                }




                }

            }

            




    }
    
}
*/