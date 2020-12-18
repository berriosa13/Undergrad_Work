package BasicReview;

import java.util.ArrayList;

public class TestScores {
    private ArrayList<Double> testScores = new ArrayList<>();

    public TestScores(ArrayList tests) {
        tests = testScores;

        for (Double tS : testScores) {
            if (tS > 100 || tS < 0) {
                throw new IllegalArgumentException("Test scores are not valid");
            }
        }
    }
    public double getAverage() {
        double average = 0.0;

        for(Double testScore : testScores) {
            average += testScore;
        }
        return average / testScores.size();

    }

    public double getHighestScore() {
        double highScore = 0.0;

        for (Double testScore : testScores) {
            highScore = testScore;
                if (testScore > highScore) {
                highScore = testScore;
                }
        }
        return highScore;
    }

    public double lowestScore() {
        double lowScore = 0.0;

        for (Double testScore : testScores) {
            lowScore = testScore;
                if (testScore < lowScore) {
                    lowScore = testScore;
                }
        }
        return lowScore;
    }
}
