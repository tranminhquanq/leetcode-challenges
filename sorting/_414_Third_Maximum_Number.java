public class _414_Third_Maximum_Number {

  public static void insert(long[] maxArr, int val) {
    int i = 0;
    while (i < maxArr.length) {
      if (val == maxArr[i]) {
        return;
      } else if (val > maxArr[i]) {
        break;
      } else {
        i++;
      }
    }
    if (i < maxArr.length) {
      for (int j = maxArr.length - 2; j >= i; j--) {
        maxArr[j + 1] = maxArr[j];
      }
      maxArr[i] = val;
    }
  };

  public static int thirdMax(int[] nums) {
    long[] maxArr = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };

    for (int i = 0; i < nums.length; i++) {
      insert(maxArr, nums[i]);
    }

    if (maxArr[2] != Long.MIN_VALUE)
      return (int) maxArr[2];

    return (int) maxArr[0];
  }

  public static void main(String[] args) {
    int[] input_1 = { 2, 2, 3, 1 }; // 1
    int[] input_2 = { 3, 2, 1 }; // 1
    int[] input_3 = { 1, 2 }; // 2

    System.out.println(thirdMax(input_1));
    System.out.println(thirdMax(input_2));
    System.out.println(thirdMax(input_3));
  }
}
