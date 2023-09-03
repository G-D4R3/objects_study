package dare.dare.object_study.chapter1.domains;

/**
 * 관람객
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return this.bag;
    }

    /**
     * (chapter1.4) 티켓 구매
     * Ticket을 구매해서 가방에 넣음
     * @param ticket
     * @return have to pay fee
     */
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
