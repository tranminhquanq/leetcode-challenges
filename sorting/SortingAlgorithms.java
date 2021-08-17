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

  public static void main(String[] args) {
    int[] input = { 5, 4, 3, 2, 1 };
    // bubbleSort(input);
    // selectionSort(input);
    insertionSort(input);
    System.out.println(Arrays.toString(input));
  }

}
