public class removeElement {

  public static int removeElementSolution(int[] a, int val) {
    int n = a.length;

    for (int i = 0; i < n; i++) {
      if (a[i] == val) {
        for (int j = i; j < n - 1; j++) {
          a[j] = a[j + 1];
        }
        n--;
        i--;
      }
    }
    return n;
  }

  public static void main(String[] args) {
    int[] input_1 = { 1, 2, 3, 2, 4, 5 };
    int[] input_2 = { 0, 2, 0, 0, 4, 5 };

    System.out.println("case 1: " + removeElementSolution(input_1, 2));
    System.out.println("case 2: " + removeElementSolution(input_2, 0));
  }
}