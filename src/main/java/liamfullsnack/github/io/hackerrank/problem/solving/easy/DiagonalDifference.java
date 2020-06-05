/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liamfullsnack.github.io.hackerrank.problem.solving.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Liam
 */
public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonalDifference = 0;

        int sumLeftToRight = 0;
        int sumRightToLeft = 0;

        int n = arr.size();
        if (n == 1) {
            diagonalDifference = abs(arr.get(0).get(0));
        } else if (n > 1) {
            for (int i = 0; i < n; i++) {
                sumLeftToRight += arr.get(i).get(i);
                sumRightToLeft += arr.get(i).get(n - 1 - i);
            }
            diagonalDifference = abs(sumLeftToRight - sumRightToLeft);
        }
        return diagonalDifference;
    }

    static int abs(int n) {
        if (n < 0) {
            n = 0 - n;
        }
        return n;
    }

    public static void main(String[] args) {

        List<Integer> firstRow = new LinkedList<>(Arrays.asList(11, 2, 4));
        List<Integer> secondRow = new LinkedList<>(Arrays.asList(4, 5, 6));
        List<Integer> thirdRow = new LinkedList<>(Arrays.asList(10, 8, -12));

        List<List<Integer>> arr = new LinkedList<>(Arrays.asList(firstRow, secondRow, thirdRow));

        System.err.println(diagonalDifference(arr));
    }
}
