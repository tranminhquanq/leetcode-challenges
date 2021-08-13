import java.util.Arrays;

public class _88_Merge_Sorted_Array {

  public static void merge(int[] n1, int m, int[] n2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;
    while (k >= 0) {
      if (j < 0) {
        n1[k] = n1[i];
        i--;
      } else if (i < 0) {
        n1[k] = n2[j];
        j--;
      } else if (n1[i] > n2[j]) {
        n1[k] = n1[i];
        i--;
      } else {
        n1[k] = n2[j];
        j--;
      }
      k--;
    }
  }

  public static void main(String[] args) {

    int[] nums_1 = { 1, 2, 3, 0, 0, 0 };
    int[] nums_2 = { 2, 5, 6 };
    merge(nums_1, 3, nums_2, 3);
    System.out.println(Arrays.toString(nums_1));
  }
}
