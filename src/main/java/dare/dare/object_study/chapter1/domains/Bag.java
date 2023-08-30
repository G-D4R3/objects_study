package dare.dare.object_study.chapter1.domains;

/**
 * 가방
 * <p>
 * 이벤트 당첨자 : 현금 + 초대장
 * <p>
 * 이벤트 미당첨자 : 현금
 */
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return this.invitation != null;
    }

    public boolean hasTicket() {
        return this.ticket != null;
    }

    /**
     * 초대장을 티켓으로 교환
     *
     * @param ticket
     */
    public void setTicket(Ticket ticket) {
        System.out.println("Bag.setTicket");
        this.ticket = ticket;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void minusAmount(Long amount) {
        System.out.println("Bag.minusAmount: amount = "+amount);
        this.amount -= amount;
    }
}
