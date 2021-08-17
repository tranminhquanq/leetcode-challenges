public class _1662_Check_If_Two_String_Arrays_Are_Equivalent {

  public static boolean arrayStringsAreEqual(String[] s1, String[] s2) {
    StringBuilder res_1 = new StringBuilder();
    StringBuilder res_2 = new StringBuilder();

    for (String s : s1) {
      res_1.append(s);
    }

    for (String s : s2) {
      res_2.append(s);
    }

    return res_1.toString().equals(res_2.toString());
  }

  public static void main(String[] args) {

    String[] s1 = { "ab", "c" };
    String[] s2 = { "a", "bc" };

    System.out.println(arrayStringsAreEqual(s1, s2));
  }
}
