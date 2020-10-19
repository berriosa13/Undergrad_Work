package HWs;

import java.util.LinkedList;

/*  Moving Average from Data Stream
    Given a stream of integers and a window size, calculate
    the moving average of all integers in the sliding window.
*/

public class HW2n3Q2 {
    double sum;
    int size;
    LinkedList<Integer> L;

    public HW2n3Q2 (int size) {
        this.L = new LinkedList<>();
        this.size = size;
    }

    public double next(int num) {
        sum += num;
        L.offer(num);

        if(L.size() <= size) {
            return sum/L.size();
        }
        sum -= L.poll();

        return sum/size;
    }



}


