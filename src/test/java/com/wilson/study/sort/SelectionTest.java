package com.wilson.study.sort;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by wilson on 16/09/2017.
 */
public class SelectionTest extends BaseAlgorithmTest {

    private Selection selection;

    @Before
    public void setUp() {
        super.setUp();
        this.selection = new Selection();
    }

    @Test
    public void testSort() {
        this.selection.sort(this.array);
        this.selection.printArr(this.array);
    }
}
