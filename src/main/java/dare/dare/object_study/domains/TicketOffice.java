package dare.dare.object_study.domains;

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
     * tickets 컬렉션에서 맨 첫 번째 위치에 저장된 Ticket을 반환
     *
     * @return Ticket
     */
    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
