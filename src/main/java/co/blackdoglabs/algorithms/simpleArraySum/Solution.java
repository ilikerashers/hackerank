package co.blackdoglabs.algorithms.simpleArraySum;

import java.util.Scanner;

/**
 * Created by jim on 30/08/15.
 */
public class Solution {

    static int solveMeFirst(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();

        boolean hasNext = in.hasNext();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);

        hasNext = in.hasNext();
        System.out.println(hasNext);
        System.out.println(sum);
    }
}
