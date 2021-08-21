public class _724_Find_Pivot_Index {

  public static int pivotIndex(int[] arr) {
    if (arr.length == 1)
      return 0;

    int rightSum = 0;
    for (int i = 0; i < arr.length; i++)
      rightSum += arr[i];

    int leftSum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i != 0)
        leftSum += arr[i - 1];

      rightSum -= arr[i];
      if (rightSum == leftSum)
        return i;
    }

    return -1;
  }
  public static void main(String[] args) {
    System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
  }
}
