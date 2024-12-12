package ProblemFour;

public class Ticket {
    private static int autoId = 0;
    private int id;
    String description;

    Ticket(){
        this.id = ++autoId;
        this.description = "Issue with login.";
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}' + "\n";
    }

    Ticket(String s){
        this.id = ++autoId;
        this.description = s;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
