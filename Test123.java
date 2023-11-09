import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test123 {

    //[10:29 AM] N, Muhammed Irshad
    //In Bakery department: From 8 to 10
    //In Checkout department: From 10 to 12
    //In Diary department: From 14 to 19
    //[10:30 AM] N, Muhammed Irshad
    //His shift timings in this case are 8 to 12 and 14 to 19.

    static List<List<Integer>> overlappingIntervals(List<List<Integer>> shiftTimings) {

//        shiftTimings.sort((a,b) -> Integer.compare(a,b));

        List<List<Integer>> overlappedIntervals = new ArrayList<>();
        overlappedIntervals.add(shiftTimings.get(0));

        List<Integer> firstIntervalUpperBound = shiftTimings.get(1);
        for (int i = 1; i < shiftTimings.size(); i++) {
            List<Integer> lastInterval = overlappedIntervals.get(overlappedIntervals.size()-1);
            List<Integer> currentInterval = shiftTimings.get(i);
            if (currentInterval.get(0)<=lastInterval.get(1)){
                lastInterval.set(1, Math.max(currentInterval.get(1), lastInterval.get(1)));
            }else {
                overlappedIntervals.add(shiftTimings.get(i));
            }
        }

        return overlappedIntervals;


    }

    public static void main(String[] args) {

        List<List<Integer>> shiftTimings = new ArrayList<>();
        List<Integer> timing1 = new ArrayList<>();
        timing1.add(8);
        timing1.add(10);
        List<Integer> timing2 = new ArrayList<>();
        timing2.add(11);
        timing2.add(12);
        List<Integer> timing3 = new ArrayList<>();
        timing3.add(13);
        timing3.add(19);
        List<Integer> timing4 = new ArrayList<>();
        timing4.add(20);
        timing4.add(22);

        shiftTimings.add(timing1);
        shiftTimings.add(timing2);
        shiftTimings.add(timing3);
        shiftTimings.add(timing4);

        System.out.println(overlappingIntervals(shiftTimings));

    }
}
