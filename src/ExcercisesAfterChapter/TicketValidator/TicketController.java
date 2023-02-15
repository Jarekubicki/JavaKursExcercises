package ExcercisesAfterChapter.TicketValidator;


import java.time.LocalDateTime;

/**
 * Created by BIURO22 on 2023-02-14
 */
public class TicketController {
    public static void main(String[] args) {

        TicketMachine ticketMachine = new TicketMachine();

        Passanger passanger1 = new Passanger("Jan", "Kowalski");
        Passanger passanger2 = new Passanger("Ola", "Brzozowaka");
        Passanger passanger3 = new Passanger("Mike", "Tyson");
        Passanger passanger4 = new Passanger("John", "Rambo");
        Passanger passanger5 = new Passanger("Pink", "Panther");
        Passanger passanger6 = new Passanger("Ola", "Nowak");
        Passanger passanger7 = new Passanger("Jackie", "Chan");
        Passanger passanger8 = new Passanger("Mikołaj", "Kopernik");
        Passanger passanger9 = new Passanger("Jarek", "Kubicki");
        Passanger passanger10 = new Passanger("Johnny", "Bean");

        ticketMachine.buyTicket(passanger2, 30);
        ticketMachine.buyTicket(passanger3, 10);
        ticketMachine.buyTicket(passanger4, 120);
        ticketMachine.buyTicket(passanger5, 5);
        ticketMachine.buyTicket(passanger6, 10);
        ticketMachine.buyTicket(passanger8, 90);
        ticketMachine.buyTicket(passanger9, 30);


        Passanger[] passangersWithTicket = {passanger2, passanger3, passanger4, passanger5, passanger6, passanger8, passanger9};


        createListOfPassengersWithInvalidTicket(passangersWithTicket);


    }

    // czas kontroli biletów = time.now + 20min

    private static boolean checkIfTicketIsValid(Passanger passanger) {
        LocalDateTime ticketTime =
                passanger.getTicket().getValidationTime().plusMinutes(passanger.getTicket().getMinutesDurationTime());
        return passanger.getTicket() != null && ticketTime.isBefore(LocalDateTime.now().plusMinutes(20));
    }

    private static Passanger[] calculatePassangerArrayLength(Passanger[] list) {
        int counter = 0;
        for (Passanger passanger : list) {
            if (checkIfTicketIsValid(passanger)) {
                counter++;
            }
        }
        return new Passanger[counter];
    }



    private static Passanger[] createListOfPassengersWithInvalidTicket(Passanger[] passangersList) {

        Passanger[] passangersInvalifTicket = calculatePassangerArrayLength(passangersList);

        for (int i = 0; i <passangersList.length; i++) {
            if (checkIfTicketIsValid(passangersList[i])) {
                passangersInvalifTicket[i] = passangersList[i];
            }
        }
        return passangersInvalifTicket;
    }

}
