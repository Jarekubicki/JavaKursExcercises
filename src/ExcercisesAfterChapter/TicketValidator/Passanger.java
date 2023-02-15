package ExcercisesAfterChapter.TicketValidator;

/**
 * Created by BIURO22 on 2023-02-14
 */
public class Passanger {

    private String firstName;
    private String lastName;
    Ticket ticket;

    public Passanger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Passanger(String firstName, String lastName, Ticket ticket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticket = ticket;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Passanger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
