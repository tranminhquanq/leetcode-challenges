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

  // refactive mergeSort
  public static int[] sortArray2(int[] arr) {
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i : arr) {
      max = Math.max(max, i);
      min = Math.min(min, i);
    }

    int range = max - min + 1;
    int countArray[] = new int[range];
    int output[] = new int[n];

    // find the count of every element from the original array
    /*
     * Note: Here I am subtracting with min, in order to deal with all -ve values
     */
    for (int i : arr)
      countArray[i - min]++;

    // modify the countArray by adding current index value with its previous index
    // values
    for (int i = 1; i < range; i++)
      countArray[i] += countArray[i - 1];

    // filling values in output array using original array by traversing it from the
    // end
    for (int i = n - 1; i >= 0; i--) {
      // int val = countArray[arr[i]-min]-1;
      output[countArray[arr[i] - min] - 1] = arr[i];
      countArray[arr[i] - min]--;
    }

    // copying output array to arr
    for (int i = 0; i < n; i++)
      arr[i] = output[i];

    return arr;
  }

  // end refactive mergeSort
  public static void main(String[] args) {
    int[] input = { 5, 4, 3, 2, 1 };
    // bubbleSort(input);
    // selectionSort(input);
    // insertionSort(input);
    // System.out.println(Arrays.toString(input));
    System.out.println(Arrays.toString(sortArray2(input)));

  }

}
