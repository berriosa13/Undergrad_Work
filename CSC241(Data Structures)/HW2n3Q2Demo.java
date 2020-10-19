package HWs;

public class HW2n3Q2Demo {
    public static void main(String[] args)  {
        HW2n3Q2 movingAverage = new HW2n3Q2(3);

        System.out.println(movingAverage.next(1)); // 1
        System.out.println(movingAverage.next(10)); // ( 1 + 10 ) / 2
        System.out.println(movingAverage.next(3)); // ( 1 + 10 + 3) /3
        System.out.println(movingAverage.next(5)); // ( 10 + 3 + 5) /3
    }
}
