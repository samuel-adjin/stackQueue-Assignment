package ProblemFour;

public class Ticket {
    private int id;
    String description;

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}' + "\n";
    }

    Ticket(int id, String s){
        this.id = id;
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
