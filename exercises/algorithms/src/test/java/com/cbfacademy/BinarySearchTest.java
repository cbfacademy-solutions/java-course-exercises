package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.cbfacademy.search.BinarySearch;
import com.cbfacademy.search.Search;

@DisplayName(value = "BinarySearch Exercise")
public class BinarySearchTest {
    Search binarySearch;
    int[] testArray = new int[50];

    @BeforeEach
    public void setUp() {
        binarySearch = new BinarySearch();
        Arrays.setAll(testArray, position -> position + 1);
    }

    @Test
    @DisplayName("returns this unit's name")
    public void returnUnitName() {
        String name = binarySearch.getName();

        assertThat(name, is("Binary Search Algorithm Exercise"));
    }

    @Test
    @DisplayName("search returns the index of the target value when it is in the middle of the array")
    public void returnsIndexWhenTargetIsMidPointInArray() {
        int result = binarySearch.search(testArray, 25);

        assertTrue(result == 24);
    }

    @Test
    @DisplayName("search returns the index of the target value when it is in the upper end of the array")
    public void returnsIndexWhenTargetUpperEndOfArray() {
        int result = binarySearch.search(testArray, 48);

        assertTrue(result == 47);
    }

    @Test
    @DisplayName("search returns the index of the target value when it is in the lower end of the array")
    public void returnsIndexWhenTargetIsLowerEndOfArray() {
        int result = binarySearch.search(testArray, 6);

        assertTrue(result == 5);
    }

    @Test
    @DisplayName("search returns -1 when the array has no elements")
    public void returnsMinusOneWhenArrayIsEmpty() {
        int[] emptyArray = new int[0];
        int result = binarySearch.search(emptyArray, 3);

        assertTrue(result == -1);
    }

    @Test
    @DisplayName("search returns -1 when the target is not found")
    public void returnsMinusOneWhenTargetIsNotFound() {
        int result = binarySearch.search(testArray, 200);

        assertTrue(result == -1);
    }

}
