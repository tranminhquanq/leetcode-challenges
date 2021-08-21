import java.util.ArrayList;
import java.util.List;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    ArrayList<Integer> result = new ArrayList<>();
    boolean[] isVisited = new boolean[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      isVisited[nums[i]] = true;
    }
    for (int i = 1; i <= nums.length; i++) {
      if (!isVisited[i]) {
        result.add(i);
      }
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println(new _448_Find_All_Numbers_Disappeared_in_an_Array().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
  }
}
