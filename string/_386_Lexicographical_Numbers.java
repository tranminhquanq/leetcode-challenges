import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _386_Lexicographical_Numbers {
  public List<Integer> lexicalOrder(int n) {
    List<String> listString = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      listString.add(String.valueOf(i));
    }
    Collections.sort(listString);
    List<Integer> result = new ArrayList<>();

    for (String s : listString) {
      result.add(Integer.parseInt(s));
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println(new _386_Lexicographical_Numbers().lexicalOrder(13));
  }
}
