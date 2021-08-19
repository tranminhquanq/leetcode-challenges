public class Example {

  public static void printElement(int[] arr, int index) {
    if (index < 0)
      return;
    System.out.println(arr[index]);
    printElement(arr, index - 1);
  }

  // remember to use recursion
  static int[] F = new int[1000];

  public static int F1(int n) {
    if (F[n] != 0)
      return F[n];
    System.out.println("Tinh F" + n);
    if (n <= 2) {
      F[1] = 1;
      F[2] = 1;
      return 1;
    }
    F[n] = F1(n - 1) + F1(n - 2);
    return F[n];
  }

  // De-recursion
  public static int F2(int n) {
    int[] F = new int[n + 1];
    F[1] = 1;
    F[2] = 1;
    for (int i = 3; i <= n; i++) {
      F[i] = F[i - 1] + F[i - 2];
    }
    return F[n];
  }

  public static void main(String[] args) {
    // int[] input = { 1, 2, 3, 4, 5 };
    // printElement(input, input.length - 1);
    // System.out.println(F1(10));
    System.out.println(F2(10));
  }
}
