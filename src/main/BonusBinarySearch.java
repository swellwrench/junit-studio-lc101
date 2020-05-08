package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int index = -1;
        for (int i : sortedNumbers) {
            index += 1;
            if (i == n) {
                return index;
            }
        }
        return -1;
    }

}
