package co.blackdoglabs.algorithms;

import javafx.util.Pair;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jim on 07/11/15.
 */
public class CalculateOverlappingIntervals {

    // Given n intervals [si, fi] find the maximum number of overlapping intervals...
    public void findOverlappingIntervals(List<Pair<Integer, Integer>> intervalList) {
        List<Pair<Integer, Integer>> sortedList = intervalList.stream().sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey())).collect(Collectors.toList());

        for(Pair<Integer, Integer> pair : sortedList) {

            int index = sortedList.indexOf(pair)+1;

            if(index < sortedList.size() && pair.getValue().intValue() > sortedList.get(index).getKey().intValue()) {
                System.out.println(String.format("Overlapping: {%s, %s} with {%s, %s} for index: %s", pair.getKey(), pair.getValue(), sortedList.get(index).getKey(), sortedList.get(index).getValue(), index));
                intervalList.remove(pair);
                intervalList.remove(sortedList.get(index));
            }
        }

        intervalList.stream().forEach(System.out::println);
    }
}
