package ClassCode;

import java.util.*;
import java.util.LinkedList;

public class JCFQueueDemo
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();


        // front <-- 1 <-- 2 <-- 3 <-- back
        q.add(1);
        q.add(2);
        q.add(3);

        // front <-- 2 <-- 3 <-- back

        int r = q.remove();
        System.out.println(r); // r == 1

    }

}


