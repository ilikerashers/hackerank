import co.blackdoglabs.algorithms.CalculateOverlappingIntervals;
import co.blackdoglabs.algorithms.ReverseLinkedList;
import javafx.util.Pair;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by jim on 07/11/15.
 */
public class OverlappingTest {

    @Test
    public void overlappingTest() {
        CalculateOverlappingIntervals calculateOverlappingIntervals = new CalculateOverlappingIntervals();

        List<Pair<Integer, Integer>> intervals = new LinkedList<>();
        intervals.add(new Pair(new Integer(1), new Integer(5)));
        intervals.add(new Pair(new Integer(2), new Integer(6)));
        intervals.add(new Pair(new Integer(13), new Integer(19)));
        intervals.add(new Pair(new Integer(7), new Integer(10)));
        intervals.add(new Pair(new Integer(12), new Integer(15)));


        calculateOverlappingIntervals.findOverlappingIntervals(intervals);
    }

    @Test
    public void reverseTest() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkedList<Integer> list = new LinkedList<>();
        IntStream.range(0,11).forEach(list::add);
        LinkedList<Integer> reversedList = reverseLinkedList.reverse(list);

        reversedList.stream().forEach(System.out::println);
    }
}
