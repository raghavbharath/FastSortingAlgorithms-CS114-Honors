# Generic Sorting Algorithms in Java

### Raghav Bharath  
### Course: CS114 Honors – Data Structures & Algorithms in Java  
### Professor: Jonathan Kapleau  
### File: `Sorts.java`
### Grade: 100/100

---

## Project Overview

For this project in my DSA in Java class, the goal was to implement and learn the **six fundamental sorting algorithms** in Java using a **generic, reusable, and object-oriented design**.

By leveraging **Java Generics** and the **`Comparable` interface**, each algorithm is designed to work with any object type that defines a natural ordering — making this project highly versatile and extensible.

---

## Key Features

- Fully generic methods using `<T extends Comparable<? super T>>`
- In-place sorting (no extra memory unless needed)
- Efficient recursive and iterative approaches
- Educational structure for comparison and benchmarking
- Tested on `Integer[]` but applicable to `String[]`, `Double[]`, or custom classes  

---

## Implemented Algorithms

| Algorithm     | Time Complexity (Avg) | Time Complexity (Worst) | Space Complexity | Type      |
|---------------|------------------------|---------------------------|------------------|-----------|
| Bubble Sort | O(n²)                  | O(n²)                     | O(1)             | Stable    |
| Insertion Sort | O(n²)             | O(n²)                     | O(1)             | Stable    |
| Selection Sort | O(n²)             | O(n²)                     | O(1)             | Unstable  |
| Quick Sort   | O(n log n)            | O(n²)                     | O(log n)         | Unstable  |
| Merge Sort   | O(n log n)            | O(n log n)                | O(n)             | Stable    |
| Heap Sort    | O(n log n)            | O(n log n)                | O(1)             | Unstable  |

---

## Example Test Case

```java
public static void main(String[] args) {
    Integer[] numbers = {5, 3, 8, 4, 2, 7, 1, 6};

    System.out.println("Original array:");
    System.out.println(Arrays.toString(numbers));

    // Choose your preferred algorithm:
    Sorts.quickSort(numbers);
    // Sorts.bubbleSort(numbers);
    // Sorts.insertSort(numbers);
    // Sorts.selectSort(numbers);
    // Sorts.mergeSort(numbers);
    // Sorts.heapSort(numbers);

    System.out.println("Sorted array:");
    System.out.println(Arrays.toString(numbers));
}
