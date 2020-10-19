package BasicReview;

public class TestScoresGeneric<T extends Number> {

    private T value;

    public TestScoresGeneric(T num) {
        value = (T) num;

        if(num.intValue() < 0 || num.intValue() > 100) {
            throw new IllegalArgumentException("Test scores are not valid");
        }
    }
}
