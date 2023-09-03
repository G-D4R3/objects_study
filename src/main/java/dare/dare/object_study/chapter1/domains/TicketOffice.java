package dare.dare.object_study.chapter1.domains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 매표소
 * <p>
 * 판매할 티켓과 금액이 보관돼 있어야 한다.
 */
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    /**
     * 티켓 판매
     * Audience에게 ticket 건네주고 받은 ticket값을 plusAmount
     * @param audience
     */
    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }


    /**
     * tickets 컬렉션에서 맨 첫 번째 위치에 저장된 Ticket을 반환
     *
     * @return Ticket
     */
    public Ticket getTicket() {
        System.out.println("TicketOffice.getTicket");
        return this.tickets.remove(0);
    }

    private void plusAmount(Long amount) {
        System.out.println("TicketOffice.plusAmount: amount = " + amount);
        this.amount += amount;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
