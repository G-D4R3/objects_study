package dare.dare.object_study.chapter2.domains;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
