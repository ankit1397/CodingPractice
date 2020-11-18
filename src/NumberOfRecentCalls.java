import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.lang.*;

public class NumberOfRecentCalls {
    static Queue<Integer> q = new LinkedList<>();

    public NumberOfRecentCalls() {

    }

    public int ping(int t) {
        q.add(t);
        int count = 0;
        Iterator iterator = q.iterator();
        while (iterator.hasNext()) {
            int val = (int) iterator.next();
            if ( val >= (t - 3000) && val <= t ) {
                count++;
            }
        }
        return count;
    }

    // Driver code
    public static void main(String args[]) {
        NumberOfRecentCalls recentCounter = new NumberOfRecentCalls();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));
    }

}
