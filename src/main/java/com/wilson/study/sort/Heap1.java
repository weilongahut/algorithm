package com.wilson.study.sort;

/**
 * <p>
 *     堆排序，建立最大堆，将最大的元素放到最后，然后维护最大堆，循环交换元素
 *     时间复杂度O(NlogN), 空间复杂度O(1)
 * </p>
 * Created by wilson on 16/09/2017.
 */
public class Heap1 extends AbstractSortAlgorithm {

    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            buildMaxHeap(a, a.length - 1 - i);
            swap(a, 0, a.length - 1 - i);
        }
    }

    private void buildMaxHeap(int a[], int lastIndex) {
        //从lastIndex处节点（最后一个节点）的父节点开始
        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
            //k保存正在判断的节点
            int k = i;
            //如果当前k节点的子节点存在
            while (k * 2 + 1 <= lastIndex) {
                //k节点的左子节点的索引
                int biggerIndex = 2 * k + 1;
                //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
                if (biggerIndex < lastIndex && less(a[biggerIndex], a[biggerIndex + 1])) {
                    biggerIndex++;
                }
                //如果k节点的值小于其较大的子节点的值
                if (a[k] < a[biggerIndex]) {
                    //交换他们
                    swap(a, k, biggerIndex);
                    //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
                    k = biggerIndex;
                } else {
                    break;
                }
            }
        }
    }
}
