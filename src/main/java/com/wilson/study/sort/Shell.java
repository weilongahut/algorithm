package com.wilson.study.sort;

/**
 * <p>
 * Shell排序
 * 一种优化的插入排序，将插入排序的步长从1调整至h
 * 使数组中任意间隔为h的元素都是有序的，这样的数组被称为h有序数组，
 * 也就是说，一个h有序数组就是h个互相独立的有序数组编织在一起组成的数组
 *
 * </p>
 * Created by wilson on 16/09/2017.
 */
public class Shell extends AbstractSortAlgorithm {

    public void sort(int[] a) {
        int N = a.length;
        int h = 1;

        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i ; j >= h&& less(a[j-h], a[j]);j-=h) {
                    swap(a, j - h, j);
                }

            }
            h = h / 3;
        }
    }
}
