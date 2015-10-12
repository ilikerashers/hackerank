package co.blackdoglabs.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jim on 30/08/15.
 */
public class Solution {

    public static void main(String[] args) throws IOException {

        boolean hasNext = true;

        // Matrix size
        int n = 0;
        int x = 0;
        Long sum = new Long(0);
        Long counterSum = new Long(0);

        while(hasNext) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String newLine = br.readLine();

            if (newLine == null) {
                hasNext = false;
            } else {

                List<String> ints = Arrays.asList(newLine.split(" "));

                if (ints.size() > 1) {

                    n = ints.size();
                    sum = Long.sum(sum, new Long(ints.get(x)));
                    counterSum = Long.sum(counterSum, new Long(ints.get((n - 1) - x)));
                    x++;
                    hasNext = !(n == x);
                }
            }
        }
        System.out.println(Math.abs(sum - counterSum));
    }
}
