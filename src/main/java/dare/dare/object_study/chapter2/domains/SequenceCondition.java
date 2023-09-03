package dare.dare.object_study.chapter2.domains;

/**
 * 순번 할인 조건
 */
public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    /**
     * param으로 전달된 screening의 상영 순번과 일치할 경우 할인 가능한 것으로 판단하여 true return
     * @param screening
     * @return isDiscountable
     */
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
