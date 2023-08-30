package dare.dare.object_study.chapter1.domains;

/**
 * 소극장
 */
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 1. 관람객의 가방 안에 초대장이 들어 있는지 확인한다.
     * <p>
     * 2-a. 초대장이 들어있다면: 이벤트 당첨 관람객. 판매원에게서 받은 티켓을 관람객의 가방 안에 넣어준다.
     * <p>
     * 2-b. 초대장이 들어있지 않다면: 티켓을 판매. 관람객의 가방에서 티켓 금액만큼 소지금 차감 + 매표소에 증액 후 가방에 티켓을 넣어준다.
     *
     * @param audience
     */
    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            System.out.println("Theater.enter: has Intvitation");
            Ticket ticket = this.ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            System.out.println("Theater.enter: hasn't Intvitation");
            Ticket ticket = this.ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            this.ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
