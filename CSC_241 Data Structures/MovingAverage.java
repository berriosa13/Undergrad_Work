package algExercises;

// This program demonstrates an algorithm used to calculate
// the moving average in weight every 3 months during a
// 12 month time period.

import java.util.ArrayList;

public class MovingAverage {

    public static void main(String[] args) {
        ArrayList<Double> Dataset = new ArrayList<>();
        ArrayList<Double> result = new ArrayList<>();
        Dataset.add(101.1);
        Dataset.add(120.2);
        Dataset.add(130.3);
        Dataset.add(120.5);
        Dataset.add(150.9);
        int N = Dataset.size();
        int M = 3;
        // M * (N - M + 1) = MN - M^2 + M
        for (int i = M - 1; i < N; i++) {
            double partialSum = 0;
            for (int j = 0; j < M; j++) {
                partialSum += Dataset.get(i - j);
                result.add(partialSum / M);
            }
        }
        System.out.println(result);
    }
}
