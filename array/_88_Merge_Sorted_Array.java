import java.util.Arrays;

public class _88_Merge_Sorted_Array {

  public static void merge(int[] n1, int m, int[] n2, int n) {
    for (int n_i : n2) {
      insertElement(n_i, n1, m);
      m++;
    }
  }

  public static void insertElement(int val, int[] arr, int m) {
    boolean isChanged = false;

    for (int k = 0; k < m; k++) {
      if (arr[k] > val) {
        isChanged = true;

        for (int i = m - 1; i >= k; i--) {
          arr[i + 1] = arr[i];
        }
        arr[k] = val;
        break;
      }
    }

    if (!isChanged) {
      arr[m] = val;
    }
  }

  public static void main(String[] args) {

    int[] nums_1 = { 1, 2, 3, 0, 0, 0 };
    int[] nums_2 = { 2, 5, 6 };
    merge(nums_1, 3, nums_2, 3);
    System.out.println(Arrays.toString(nums_1));
  }
}
