package dare.dare.object_study.chapter1.domains;

/**
 * 판매원
 * <p>
 * 매표소에서 초대장을 티켓으로 교환해주거나 티켓을 판매하는 역할
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return this.ticketOffice;
    }

    /**
     * (chapter1.3) 티켓 판매
     */
    public void sellTo(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            System.out.println("Theater.enter: has Intvitation");
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            System.out.println("Theater.enter: hasn't Intvitation");
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
