package ProblemFour;

public class TestTicket {

    public static void main(String[] args) {
        TicketingSystem ts = new TicketingSystem();
        ts.addTicket("Issue with login");
        ts.addTicket("Cannot update the window security.");
        ts.addTicket("Window error.");
        System.out.println("1. After adding the tickets : \n " + ts);
        System.out.println("2. View the ticket : \n" + ts.viewNextTicket());
        System.out.println("3. After viewing the tickets : \n " +ts);
        System.out.println("4. Process the ticket : \n" +ts.processTicket());
        System.out.println("5. After process the ticket : \n "+ ts);
    }
}
