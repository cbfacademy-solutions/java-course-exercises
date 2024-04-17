package com.cbfacademy.search;

public class App {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 6;

        System.out.println(binarySearch.search(sortedArray, target));
    }
}
