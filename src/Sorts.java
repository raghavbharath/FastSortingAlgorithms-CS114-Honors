/**
 * Raghav Bharath
 *  Sorts.java
 *  Professor Kapleau
 *  CS114H02
 *  
 */


 import java.util.Arrays;

 public class Sorts 
 {
 
     public static <T extends Comparable<? super T>> void heapSort(T[] array) 
     {
         int size = array.length;
 
         // Generates max heap
         for (int i = size / 2 - 1; i >= 0; i--) 
         {
             heapify(array, size, i);
         }
 
         // Pulls out the elements from heap one by one
         for (int i = size - 1; i > 0; i--) {
             
             T temp = array[0];
             array[0] = array[i];
             array[i] = temp;
 
             heapify(array, i, 0);
         }
     }
     
     private static <T extends Comparable<? super T>> void heapify(T[] array, int n, int i) {
         int biggest = i;
         int left = 2 * i + 1;
         int right = 2 * i + 2;
 
         // Left Check
         if (left < n && array[left].compareTo(array[biggest]) > 0) {
             biggest = left;
         }
 
         // Right Check
         if (right < n && array[right].compareTo(array[biggest]) > 0) {
             biggest = right;
         }
 
         if (biggest != i) 
         {
             T temp = array[i];
             array[i] = array[biggest];
             array[biggest] = temp;
 
             heapify(array, n, biggest);
         }
     }
 
     public static <T extends Comparable<? super T>> void bubbleSort(T[] array) 
     {
 
         T temp;
         boolean sorted;
 
         for (int i = array.length - 1; i > 0; --i) {
 
             sorted = true;
 
             for (int j = 0; j < i; ++j) {
 
                 if (array[j].compareTo(array[j + 1]) > 0) {
 
                     sorted = false;
 
                     temp = array[j];
                     array[j] = array[j + 1];
                     array[j + 1] = temp;
                 }
             }
 
             if (sorted) {
                 break;
             }
         }
     }
 
     public static <T extends Comparable<? super T>> void insertSort(T[] array) 
     {
 
         T temp;
         int j;
 
         for (int i = 1; i < array.length; ++i) {
 
             temp = array[i];
 
             for (j = i; j > 0; --j) {
 
                 if (array[j - 1].compareTo(temp) > 0) {
                     array[j] = array[j - 1];
                 }
                 else 
                 {
                     break;
                 }
             }
 
             if (j < i) 
             {
                 array[j] = temp;
             }
         }
     }
 
     public static <T extends Comparable<? super T>> void mergeSort(T[] array) 
     {
 
         if (array.length > 1) 
         {
 
             T[] left  = Arrays.copyOfRange(array, 0, array.length / 2);
             T[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
 
             mergeSort(left);
             mergeSort(right);
 
             int i, l = 0, r = 0;
 
             for (i = 0; i < array.length && l < left.length && r < right.length; ++i) 
             {
                 if (left[l].compareTo(right[r]) <= 0) {
                     array[i] = left[l++];
                 }
                 else {
                     array[i] = right[r++];
                 }
             }
 
             if (i < array.length) 
             {
                 if (l < left.length) {
                     while (i < array.length) 
                     {
                         array[i++] = left[l++];
                     }
                 }
                 else 
                 {
                     while (i < array.length) 
                     {
                         array[i++] = right[r++];
                     }
                 }
             }
         }
     }
 
     public static <T extends Comparable<? super T>> void quickSort(T[] array) 
     {
 
         quickSort(array, 0, array.length - 1);
     }
 
     private static <T extends Comparable<? super T>> void quickSort(T[] array, int left, int right) 
     {
 
         int pivot = right;
 
         int l = left, r = right;
 
         if (left < right) 
         {
             while (l < r) 
             {
 
                 while (l < r && array[l].compareTo(array[pivot]) <= 0) 
                 {
                     ++l;
                 }
 
                 while (l < r && array[pivot].compareTo(array[r]) <= 0) 
                 {
                     --r;
                 }
 
                 if (l < r) 
                 {
                     T temp = array[l];
                     array[l] = array[r];
                     array[r] = temp;
                 }
             }
 
             if (r != pivot) 
             {
                 T temp = array[pivot];
                 array[pivot] = array[r];
                 array[r] = temp;
             }
 
             quickSort(array, left, r - 1);
             quickSort(array, r + 1, right);
         }
     }
 
     public static <T extends Comparable<? super T>> void selectSort(T[] array) 
     {
 
         T temp;
         int mini;
 
         for (int i = 0; i < array.length - 1; ++i) {
 
             mini = i;
 
             for (int j = i + 1; j < array.length; ++j) 
             {
 
                 if (array[j].compareTo(array[mini]) < 0) 
                 {
                     mini = j;
                 }
             }
 
             if (i != mini) 
             {
 
                 temp = array[i];
                 array[i] = array[mini];
                 array[mini] = temp;
             }
         }
     }
    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 8, 4, 2, 7, 1, 6};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(numbers));

        // Call any sorting method here:
        Sorts.quickSort(numbers);
        // Sorts.bubbleSort(numbers);
        // Sorts.mergeSort(numbers);
        // Sorts.selectSort(numbers);
        // Sorts.insertSort(numbers);
        // Sorts.heapSort(numbers);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(numbers));
}
 }
