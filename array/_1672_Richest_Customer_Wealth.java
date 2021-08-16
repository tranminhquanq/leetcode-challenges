public class _1672_Richest_Customer_Wealth {
  public static int maximumWealth(int[][] accounts) {
    int max = 0;
    for (int row = 0; row < accounts.length; row++) {
      int temp = 0;
      for (int col = 0; col < accounts[row].length; col++) {
        temp += accounts[row][col];
      }
      max = Math.max(max, temp);
    }
    return max;
  }

  public static void main(String[] args) {
    int[][] accounts_1 = { { 1, 2, 3 }, { 3, 2, 1 } }; // 6
    int[][] accounts_2 = { { 1, 5 }, { 7, 3 }, { 3, 5 } }; // 10
    int[][] accounts_3 = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }; // 17

    System.out.println("case 1: " + maximumWealth(accounts_1));
    System.out.println("case 2: " + maximumWealth(accounts_2));
    System.out.println("case 3: " + maximumWealth(accounts_3));
  }
}
