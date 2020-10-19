package AlgorithmAnalysis;


public class Sum100 {
    public static void main(String[] args) {
        // solution 1 -- for loop
        long startTime1 = System.currentTimeMillis();
        int sum = 0;
        for(int i = 1; i <= 10; i++)
        {
            sum += i;
        }
        System.out.println(sum);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time duration:" + (endTime1 - startTime1));

        // solution 2 -- formula
        long startTime2 = System.currentTimeMillis();
        int sum2 = 0;
        int n = 10;
        sum2 = (n+1) * n / 2;
        System.out.println(sum2);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time duration:" + (endTime2 - startTime2));
    }
}

