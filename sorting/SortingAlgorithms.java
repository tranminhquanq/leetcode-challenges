import java.util.Arrays;

public class SortingAlgorithms {
  public static void bubbleSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      boolean isSorted = true;
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          isSorted = false;
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }

      if (isSorted) {
        break;
      }
    }
  }

  public static void selectionSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (array[j] < array[min]) {
          min = j;
        }
      }
      if (min != i) {
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
      }
    }
  }

  public static void insertionSort(int[] array) {
    int n = array.length;
    for (int i = 1; i < n; i++) {
      int j = i - 1;
      int ai = array[i];

      while (j >= 0 && array[j] > ai) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = ai;
    }
  }
  
  // Merge sort
  public static int[] sortArray(int[] array) {
    return mergeSort(array, 0, array.length - 1);
  }
  public static int[] mergeSort(int[] a, int L, int R) {
    // If the subarray size is 1, return the array
    if (L == R) {
      int[] singleElement = { a[L] };
      return singleElement;
    }

    // Find the mid point
    int key = (L + R) / 2;
    // Sort the left and right halves
    int[] a1 = mergeSort(a, L, key);
    // Sort the right and left halves
    int[] a2 = mergeSort(a, key + 1, R);
    // Merge the two sorted arrays
    int[] result = merge(a1, a2);
    return result;
  }

  public static int[] merge(int[] a1, int[] a2) {
    // Merge the two sorted arrays
    int n = a1.length + a2.length;
    int[] result = new int[n];
    int i = 0, i1 = 0, i2 = 0;
    while (i < n) {
      if (i1 < a1.length && i2 < a2.length) { // a1 & a2 are not empty
        if (a1[i1] < a2[i2]) {
          result[i] = a1[i1];
          i++;
          i1++;
        } else {
          result[i] = a2[i2];
          i++;
          i2++;
        }
      } else { // a1 or a2 is empty
        if (i1 < a1.length) { // a1 is not empty
          result[i] = a1[i1];
          i++;
          i1++;
        } else { // a2 is not empty
          result[i] = a2[i2];
          i++;
          i2++;
        }
      }
    }
   // return the merged array
    return result;
  }
  // end Merge sort

  // quicksort 
  public static void quicksort(int[] array, int L, int R) {
    if(L >= R) return;
    // choose a key
    int key = array[(L + R) / 2];
    // partition the array
    int pivot = partition(array, L, R, key);
    // recursively sort the left and right halves
    quicksort(array, L, pivot - 1);
    // recursively sort the right and left halves
    quicksort(array, pivot, R);
  }

  // return the pivot
  public static int partition(int[] array, int L, int R, int key) {
    int iL = L, iR = R;
    while (iL <= iR) {
      // find the first element that is greater than the key
      while (array[iL] < key)
        iL++;
      // find the first element that is smaller than the key
      while (array[iR] > key)
        iR--;
      // swap the elements if they are out of order
      if (iL <= iR) {
        int temp = array[iL];
        array[iL] = array[iR];
        array[iR] = temp;
        iL++;
        iR--;
      }
    }
    return iL;
  }
  public static void main(String[] args) {
    int[] input = { 5, 4, 3, 2, 1 };
    // bubbleSort(input);
    // selectionSort(input);
    // insertionSort(input);
    // System.out.println(Arrays.toString(input));
    // System.out.println(Arrays.toString(sortArray(input)));
    quicksort(input, 0, input.length - 1);
    System.out.println(Arrays.toString(input));

  }

}
