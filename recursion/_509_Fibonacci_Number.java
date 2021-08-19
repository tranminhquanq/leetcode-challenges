public class _509_Fibonacci_Number {

  public static int fibonnaci(int n) {

    // use recursion to solve the problem

    // if (n <= 1)
    // return n;
    // return fibonnaci(n - 1) + fibonnaci(n - 2);

    // refactor code to use loop instead of recursion
    if (n == 0 || n == 1)
      return n;

    int a = 0;
    int b = 1;
    int c;

    for (int i = 2; i <= n; i++) {
      c = a + b;
      a = b;
      b = c;
    }
    return b;
  }

  public static void main(String[] args) {
    System.out.println(fibonnaci(2)); // 1
    System.out.println(fibonnaci(3)); // 2
    System.out.println(fibonnaci(4)); // 3
  }
}
