package ExcercisesAfterChapter.TicketValidator;

import java.time.LocalDateTime;

/**
 * Created by BIURO22 on 2023-02-14
 */
public class TicketMachine {



    public void buyTicket(Passanger passanger, long minutesDurationTime) {
        Ticket ticket = new Ticket(LocalDateTime.now(),minutesDurationTime);
        passanger.setTicket(ticket);
    }
}
