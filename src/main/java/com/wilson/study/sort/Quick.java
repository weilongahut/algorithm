package com.wilson.study.sort;

/**
 * Created by wilson on 16/09/2017.
 */
public class Quick extends AbstractSortAlgorithm {

    public void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private void quickSort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        // 找到中间位置
        int j = partition(a, lo, hi);
        quickSort(a, lo, j - 1);
        quickSort(a, j + 1, hi);
    }

    private int partition(int[] a, int lo, int hi) {

        int i = lo, j = hi + 1;
        int midValue = a[lo];

        while (true) {
            while (less(a[++i], midValue)) {
                if (i == hi) {
                    break;
                }
            }

            while (less(midValue, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            // 交换左右元素
            swap(a, i, j);
        }
        // 将midValue放入到正确的位置
        swap(a, lo, j);
        return j;
    }
}
