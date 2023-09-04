package com.cbfacademy.search;

public class SearchAlgoExercise implements Search {
    public int binarySearch(int[] sortedArray, int target) {
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

    public String getName() {
        return "Search Algorithm Exercise";
    }
}
