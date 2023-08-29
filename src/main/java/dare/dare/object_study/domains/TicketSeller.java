package dare.dare.object_study.domains;

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
        return ticketOffice;
    }
}
