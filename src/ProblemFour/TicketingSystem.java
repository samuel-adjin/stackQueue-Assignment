package ProblemFour;

import java.util.LinkedList;
import java.util.Queue;
public class TicketingSystem {
    Queue<Ticket> tickets = new LinkedList<>();
    public void addTicket(String description){
        Ticket aticket = new Ticket(description);
        tickets.add(aticket);
        System.out.println("Ticket added successfully...");
    }

    @Override
    public String toString() {
        return "TicketingSystem {" +
                "ID = " + tickets +
                '}' + "\n";
    }

    public Ticket processTicket(){
        if (tickets.isEmpty()) {
            System.out.println("No remaining ticket.");
            return null;
        }
        return tickets.poll();
    }

    public Ticket viewNextTicket(){
        if (tickets.isEmpty()) {
            System.out.println("No remaining ticket.");
            return null;
        }
        return tickets.peek();
    }



}
