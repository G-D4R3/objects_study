package dare.dare.object_study.chapter2.domains;

import java.math.BigDecimal;

/**
 * <h3>금액</h3>
 * Long 대신 객체로 구현하여 사용
 * <p>
 * Long 타입은 변수의 크기나 연산자의 종류와 관련된 구현 관점의 제약은 표현할 수 있지만, Money 타입처럼 저장하는 값이 금액과 관련되어 있다는 의미를 전달할 수 없음
 * <p>
 * 하나의 인스턴스 변수만 포함하더라도 개념을 명시적으로 표현하는 것은 전체적인 설계의 명확성과 유연성을 높임
 */
public class Money {
    public static final Money ZERO = Money.wons(0);

    private final BigDecimal amount;

    public static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(double amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money plus(Money amount) {
        return new Money(this.amount.add(amount.amount));
    }

    public Money minus(Money amount) {
        return new Money(this.amount.subtract(amount.amount));
    }

    public Money times(double percent) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public boolean isLessThan(Money other) {
        return amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThen(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }
}
