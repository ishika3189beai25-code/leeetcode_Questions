import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();

        pq.add(1L);
        set.add(1L);

        long ugly = 1;

        for (int i = 0; i < n; i++) {
            ugly = pq.poll();

            long a = ugly * 2;
            long b = ugly * 3;
            long c = ugly * 5;

            if (set.add(a)) pq.add(a);
            if (set.add(b)) pq.add(b);
            if (set.add(c)) pq.add(c);
        }

        return (int) ugly;
    }
}