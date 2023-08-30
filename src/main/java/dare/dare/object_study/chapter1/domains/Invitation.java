package dare.dare.object_study.chapter1.domains;

import java.time.LocalDateTime;

/**
 * 초대장
 * <p>
 * 이벤트 당첨자에게 발송
 */
public class Invitation {

    /**
     * 공연을 관람할 수 있는 초대일자
     */
    private LocalDateTime when;

    public Invitation(LocalDateTime when) {
        this.when = when;
    }
}
