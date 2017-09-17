package com.wilson.study.sort;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by wilson on 16/09/2017.
 */
public class SortTest extends BaseAlgorithmTest {

    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void testMerge() {

        Merge merge = new Merge();
        merge.sort(this.array);
        merge.printArr(this.array);

    }

    @Test
    public void testQuick() {
        Quick quick = new Quick();
        quick.sort(this.array);
        quick.printArr(this.array);
    }

    @Test
    public void testHeap() {
        Heap1 heap = new Heap1();
        heap.sort(this.array);
        heap.printArr(this.array);

    }
}
