package test;

import org.junit.Before;
import org.junit.Test;

import static main.BonusBinarySearch.binarySearch;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BonusBinarySearchTest {

    private static int[] testArray = {0,2,4,6,8,10,12,14,16,18};

    @Test
    public void presentEntryReturnsCorrectIndex() {
        assertEquals(binarySearch(testArray, 10), 5);
    }

    @Test
    public void presentEntryReturnsCorrectIndexForFirstValue() {
        assertEquals(binarySearch(testArray, 0), 0);
    }

    @Test
    public void presentEntryReturnsCorrectIndexForLastValue() {
        assertEquals(binarySearch(testArray, 18), 9);
    }

    @Test
    public void absentEntryReturnsNegativeOne() {
        assertEquals(binarySearch(testArray, 1), -1);
    }

}
