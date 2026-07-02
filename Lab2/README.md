# Lab 2: Interactive Array Algorithms

## Overview
This lab implements two interactive console programs in Java that read all input from the user via `Scanner`.

## Files
- `FindMax.java` — Finds the maximum value in a user-entered array and its index.
- `PairSum.java` — Uses brute-force (nested loop) search to find a pair of elements that sum to a user-entered target.

## Task 1: FindMax.java
**Approach:** Linear search. The array is scanned once, keeping track of the largest value seen so far and its index.
**Time Complexity:** O(n) — one pass through the array.

**Sample Run:**
```
Enter the number of elements in the array: 5
Enter 5 integer values:
Element [0]: 3
Element [1]: 9
Element [2]: 1
Element [3]: 6
Element [4]: 2

--- Find Maximum Result ---
Array entered: [3, 9, 1, 6, 2]
Maximum value: 9
Found at index: 1
```

## Task 2: PairSum.java
**Approach:** Brute force nested loops. For every element at index `i`, compare against every later element at index `j` to check if `arr[i] + arr[j] == target`. Stops as soon as the first matching pair is found.
**Time Complexity:** O(n²) — nested loop over all pairs in the worst case.

**Sample Run:**
```
Enter the number of elements in the array: 5
Enter 5 integer values:
Element [0]: 2
Element [1]: 4
Element [2]: 7
Element [3]: 11
Element [4]: 15
Enter the Target Sum: 9

--- Pair Sum Result ---
Pair found at indices 1 and 2
Values: 4 and 7
Equation: 4 + 7 = 9
```

## Author
Macpaul
