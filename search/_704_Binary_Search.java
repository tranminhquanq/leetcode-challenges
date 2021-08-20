public class _704_Binary_Search {
  public static int binnarSearch(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if(nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] intput_1 = {-1,0,3,5,9,12};
    System.out.println(binnarSearch(intput_1, 9));
  }
}