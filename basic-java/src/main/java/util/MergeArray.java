package util;

import java.util.Arrays;

/**
 * create by cherie on 04/03/2019.
 */
public class MergeArray {

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {2, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(Arrays.toString(mergeArray(a, b)));
    }

    private static int[] mergeArray(int[] a, int[] b) {
//        Assert.checkNonNull(a);
//        Assert.checkNonNull(b);

        int[] result = new int[a.length + b.length];
        int i = 0, j = 0;
        for (int m = 0; m < result.length; m++) {

            if (i > a.length - 1 || a[i] >= b[j]) {
                result[m] = b[j];
                j++;
                continue;
            }
            if (j > b.length - 1 || a[i] < b[j]) {
                result[m] = a[i];
                i++;
            }

        }
        return result;
    }
}
