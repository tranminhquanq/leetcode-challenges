public class _704_Binary_Search {
  public static int binnarSearch(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
  
  public static int binnarSearchUsingRecursion(int[] nums, int target, int left, int right) {
    if (left > right)
      return -1;

    int mid = (left + right) / 2;
    if (nums[mid] == target) {
      return mid;
    } else if (nums[mid] < target) {
      return binnarSearchUsingRecursion(nums, target, mid + 1, right);
    } else {
      return binnarSearchUsingRecursion(nums, target, left, mid - 1);
    }
  }
  
  public static int binnarSearchUsingRecursion(int[] nums, int target) {
    int n = nums.length;
    return binnarSearchUsingRecursion(nums, target, 0, n - 1);
  }

  public static void main(String[] args) {
    int[] intput_1 = {-1,0,3,5,9,12};
    // System.out.println(binnarSearch(intput_1, 9));
    System.out.println(binnarSearchUsingRecursion(intput_1, 9));
  }
}