package Review;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class TestScoresDemo {
    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<Double> scores = new ArrayList<>();
        TestScoresGeneric<Double> gen1 = new TestScoresGeneric<>(Math.random()*(100)+1);
        TestScoresGeneric<Integer> gen2 = new TestScoresGeneric<>(rand.nextInt((int) (Math.random()*(100)+1)));

        for (int i = 0; i < 10; i++) {
            scores.add(rand.nextDouble()*100);
        }

        TestScores test = new TestScores(scores);
        DecimalFormat format = new DecimalFormat("##.#");

        scores.add(gen1.getT());
        scores.add(gen2.getT()+.00);

        System.out.println();

        System.out.println("\t\t\t\t\t-----Test Scores-----");
        for (Double score : scores) {
            System.out.print("  " + format.format(score));
        }
        System.out.println();

        System.out.printf("\n\t\t\t\t\tAverage score is: %.1f\n", test.getAverage());
        System.out.printf("\t\t\t\t\tHighest score is: %.1f\n", test.getHighestScore());
        System.out.printf("\t\t\t\t\tLowest score is: %.1f\n", test.getLowestScore());

        scores.clear();
    }
}

