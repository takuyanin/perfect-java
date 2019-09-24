import java.util.*;

public class Main {
  static void exec(List<? extends CharSequence> list) {
    // CharSequence cs = list.get(0);
  }

  public static void main(String... args) {
    exec(new ArrayList<String>());
    exec(new ArrayList<String>());
  }
}
