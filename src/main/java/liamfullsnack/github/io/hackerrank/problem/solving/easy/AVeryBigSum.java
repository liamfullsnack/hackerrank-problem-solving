/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liamfullsnack.github.io.hackerrank.problem.solving.easy;

/**
 *
 * @author Liam
 */
public class AVeryBigSum {

    static long aVeryBigSum(long[] ar) {
        long sum = 0L;
        if (ar != null && ar.length > 0) {
            for (int i = 0; i < ar.length; i++) {
                sum += ar[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        long[] ar = new long[100];
        for (int i = 0; i < ar.length; i++){
            ar[i] = Integer.MAX_VALUE + i;
        }
        System.err.println(aVeryBigSum(ar));
    }
}
