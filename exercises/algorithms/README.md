README.md

# Popular Algorithms

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of these programming exercises is to practise:
- algorithmic thinking
- implementing popular algorithms in Java

For this assignment, we've provided the starter project above.

## :pushpin: Sorting

### Merge Sort<sup>1</sup>

Here is the pseudocode for the Merge Sort algorithm:

- declare the `left` and `right` variables, which will mark the extreme indices of the array of size `n`
- `left` will be assigned to 0 and `right` will be assigned to `n-1`
- Find `mid = (left + right) / 2`
- Call `mergeSort` on `(left, mid)` and `(mid + 1, right)`
- Continue the above until `left > right`
- Then call `merge` on the 2 sub-problems

Given what we've learned about this algorithm, create a program that implements it in Java.

```txt
mergeSort(arr, left, right):
    if left > right 
        return
    mid = (left+right)/2
    mergeSort(arr, left, mid)
    mergeSort(arr, mid+1, right)
    merge(arr, left, mid, right)
end
```

<sup>1</sup><sub>Compare with [this implementation][4]</sub>

### Quick Sort<sup>2</sup>

Here is the pseudocode for the Quick Sort algorithm:

- we are given with an input array of size `n`
- choose a `pivot` element - here we are choosing the last element as our `pivot`

Now partition the array as per our `pivot`
- keep a partitioned index say `p` and initialize it to `-1`
- Iterate through every element in the array except the `pivot`
- If an element is less than the `pivot`, then increment p and swap the elements at index `p` with the element at index `i`.
- Once all the elements are traversed, swap pivot with element present at `p+1` as this will the same position as in the sorted array
- Now return the `pivot` index

Once partitioned, now make 2 calls on quicksort
- One from `beg` to `p-1`
- Other from `p+1` to `n-1`

Given what we've learned about this algorithm, create a program that implements it in Java.

```txt
quickSort(arr, beg, end)
  if (beg < end)
    pivotIndex = partition(arr,beg, end)
    quickSort(arr, beg, pivotIndex)
    quickSort(arr, pivotIndex + 1, end)

partition(arr, beg, end)
  set end as pivotIndex
  pIndex = beg - 1
  for i = beg to end-1
  if arr[i] < pivot
    swap arr[i] and arr[pIndex]
    pIndex++
  swap pivot and arr[pIndex+1]
return pIndex + 1
```

<sup>2</sup><sub>Compare with [this implementation][5]</sub>


## :pushpin: Searching

### Binary Search
Here is the pseudocode for the Binary Search algorithm.

NB: remember that this algorithm expects to be given sorted data otherwise the results will be unpredictable.
```txt
do until the pointers low and high meet each other.
    //find the index at the mid point of the given array (add the lowest index to the highest index and divide by two, e.g. 0 + 10 / 2 = 5)
    mid = (low + high)/2
    //if the target value is the mid point element
    if (target == arr[mid])
        // return the index number for the mid point of the array 
        return mid
    // if the target value is higher than the value of the mid point element 
    else if (target > arr[mid]) // target could be on the right side of the array
        // set the low index to the right of the middle 
        low = mid + 1
    // in all other cases
    else                       // target could be on the left side of the array
        // set the high index to the left of the middle
        high = mid - 1
```

Given this algorithm:
- in the `search` folder, create a new class `BinarySearch` that implements the provided `Search` interface
- in `BinarySearch` implement the `search` method
  - if the target value is found in the given array, the method should return the index for that value
  - if the target value is not present, the method should return -1

## :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the `BinarySearchTest` tests.

In your terminal, ensure that you are in the `algorithms` folder.
Then run the following command in your terminal.

```shell
./mvnw clean test
```

If you are on Windows, run this command instead:

```shell
mvnw.cmd clean test
```

### Tests Results

Your implementation is correct when all tests pass:

```shell
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] ├─ Basic Test Suite - 0.018s
[INFO] │  └─ ✔ creates the app - 0.01s
[INFO] ├─ Search Algorithm Exercise - 0.01s
[INFO] │  ├─ ✔ search returns -1 when the target is not found - 0.002s
[INFO] │  ├─ ✔ search returns -1 when the array has no elements - 0s
[INFO] │  ├─ ✔ returns this unit's name - 0.001s
[INFO] │  ├─ ✔ search returns the index of the target value when it is in the middle of the array - 0s
[INFO] │  ├─ ✔ search returns the index of the target value when it is in the upper end of the array - 0s
[INFO] │  └─ ✔ search returns the index of the target value when it is in the lower end of the array - 0s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.038 s
[INFO] Finished at: 2023-09-04T20:11:32+01:00
[INFO] ------------------------------------------------------------------------

```

[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/
[4]: https://www.programiz.com/java-programming/examples/merge-sort
[5]: https://www.programiz.com/java-programming/examples/quick-sort