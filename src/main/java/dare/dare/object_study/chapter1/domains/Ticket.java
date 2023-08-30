package dare.dare.object_study.chapter1.domains;

/**
 * 공연 티켓
 * 공연을 관람하기 원하는 모든 사람들은 티켓을 소지하고 있어야 한다
 */
public class Ticket {
    private Long fee;

    public Ticket(Long fee) {
        this.fee = fee;
    }

    public Long getFee() {
        System.out.println("Ticket.getFee: fee = "+this.fee);
        return this.fee;
    }
}
