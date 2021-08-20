public class _704_Binary_Search {
  public static int binarySearch(int[] nums, int target) {
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
  
  public static int binarySearchUsingRecursion(int[] nums, int target, int left, int right) {
    if (left > right)
      return -1;

    int mid = (left + right) / 2;
    if (nums[mid] == target) {
      return mid;
    } else if (nums[mid] < target) {
      return binarySearchUsingRecursion(nums, target, mid + 1, right);
    } else {
      return binarySearchUsingRecursion(nums, target, left, mid - 1);
    }
  }
  
  public static int binarySearchUsingRecursion(int[] nums, int target) {
    int n = nums.length;
    return binarySearchUsingRecursion(nums, target, 0, n - 1);
  }

  public static void main(String[] args) {
    int[] intput_1 = {-1,0,3,5,9,12};
    // System.out.println(binarySearch(intput_1, 9));
    System.out.println(binarySearchUsingRecursion(intput_1, 9));
  }
}