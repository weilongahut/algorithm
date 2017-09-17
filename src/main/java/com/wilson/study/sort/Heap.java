package com.wilson.study.sort;

/**
 * Created by wilson on 16/09/2017.
 */
public class Heap extends AbstractSortAlgorithm {

    public void sort(int[] a) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length;i++) {
            b[i + 1] = a[i];
        }

        int N = a.length;
        for (int k = N/2; k >= 1; k--) {
            sink(b, k, N);
        }

        while (N > 1) {
            swap(b, 1, N--);
            sink(b, 1, N);
        }

        for (int i = 0; i < a.length; i ++) {
            a[i] = b[i + 1];
        }
    }

    /**
     * <p>
     *     使堆有序
     * </p>
     * @param a
     * @param i
     * @param n
     */
    private void sink(int[] a, int i, int n) {

        while (2 * i <= n) {
            int j = 2*i;
            if (j < n && less(a[j], a[j++])) {
                j++;
            }
            if (!less(a[j], a[i])) {
                break;
            }
            swap(a, i, j);
            i = j;
        }

    }
}
