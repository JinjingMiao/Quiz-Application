package com.leetcode.JJMiao;

import java.util.PriorityQueue;

public class UglyNumber35 {
    public static void main(String[] args) {
        int n =10;
        System.out.println(nthUglyNumber(n));

    }
    public static int nthUglyNumber(int n) {
        if (n == 1) return 1;
        PriorityQueue<Long> q = new PriorityQueue();
        q.add(1l);

        for (long i = 1; i < n; i++) {
            long tmp = q.poll();
            while (!q.isEmpty() && q.peek() == tmp) tmp = q.poll();

            //q.add(tmp * 2);
            q.add(tmp * 3);
            q.add(tmp * 5);
        }
        return q.poll().intValue();

    }
}
