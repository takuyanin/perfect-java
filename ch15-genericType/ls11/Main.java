import java.util.*;

class My<T> {
  T exec1(T t) {
    return t;
  }

  <T> T exec2(T t) {
    return t;
  }

  static <T> T exec3(T t) {
    return t;
  }
}

public class Main {
  public static void main(String[] args) {
    My<Integer> my = new My<>();
    System.out.println(my.exec1(100));
    System.out.println(my.exec2("abc"));
    System.out.println(My.exec3("def"));

    // show type clearly if you can't rely on type assuming
    System.out.println(my.<Integer>exec1(200));
    System.out.println(my.<String>exec2("ghi"));
    System.out.println(My.<String>exec3("jkl"));
  }
}
