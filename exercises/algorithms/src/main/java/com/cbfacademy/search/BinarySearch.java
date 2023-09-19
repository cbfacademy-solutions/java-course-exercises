package com.cbfacademy.search;

public class BinarySearch implements Search {
    /**
     * Searches an array using the Binary Search algorithm.
     *
     * @param sortedArray   The array to be searched (the array should be sorted to prevent unpredicatable results)
     * @param target        The value to be searched for in the array
     */
    public int search(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == sortedArray[mid])
                return mid;
            else if (target > sortedArray[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;

    }

    /**
     * Returns the exercise name
     */
    public String getName() {
        return "Binary Search Algorithm Exercise";
    }
}
