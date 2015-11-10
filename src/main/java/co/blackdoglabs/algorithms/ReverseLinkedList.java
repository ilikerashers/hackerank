package co.blackdoglabs.algorithms;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jim on 07/11/15.
 */
public class ReverseLinkedList {

    // Given n intervals [si, fi] find the maximum number of overlapping intervals...
    public LinkedList<Integer> reverse(LinkedList<Integer> intervalList) {

        int centre = (intervalList.size())/2;

        for(int i = 0; i < centre; i++) {
            intervalList.set(i, intervalList.set(intervalList.size()-1-i, intervalList.get(i)));
        }

        return intervalList;
    }
}
