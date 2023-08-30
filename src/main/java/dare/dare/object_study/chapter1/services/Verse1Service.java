package dare.dare.object_study.chapter1.services;

import dare.dare.object_study.chapter1.domains.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Verse1Service {
    long ticketOfficeAmount = 100000;
    long ticketFee = 10000;
    Theater theater = null;

    public Verse1Service() {
        Ticket ticket1 = new Ticket(this.ticketFee);
        Ticket ticket2 = new Ticket(this.ticketFee);
        TicketOffice ticketOffice = new TicketOffice(this.ticketOfficeAmount, ticket1, ticket2);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);
        this.theater = theater;
    }


    public void enter(Audience audience) {
        this.theater.enter(audience);
    }
}
