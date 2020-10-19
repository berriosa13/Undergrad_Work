package Review;


import java.util.ArrayList;

public class TestScores {

    private ArrayList<Double> testScores;

    public TestScores(ArrayList<Double> scores) {

        testScores = scores;
        for (Double tS : scores) {

            if ((tS < 0) || ( tS > 100)) {
                throw new IllegalArgumentException("Test scores are not valid");
            }
        }
    }

    public double getAverage() {
        double average = 0.0;

        for (Double testScore : testScores) {
            average += testScore;
        }
        return average / testScores.size();
    }

    public double getHighestScore() {
        double highScore =  testScores.get(0);

        for (Double testScore : testScores) {
            if (testScore > highScore) {
                highScore =  testScore;
            }
        }
        return highScore;
    }

    public double getLowestScore() {
        Double lowScore = testScores.get(0);

        for (Double testScore : testScores) {
            if (testScore < lowScore) {
                lowScore = testScore;
            }
        }
        return lowScore;
    }
}

