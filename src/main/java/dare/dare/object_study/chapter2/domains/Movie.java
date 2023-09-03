package dare.dare.object_study.chapter2.domains;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;;
    }

    public Money getFee() {
        return fee;
    }

    /**
     * 영화 요금 계산
     * @param screening
     * @return 기본요금(fee)에서 할인 요금이 차감된 금액
     */
    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
