public class Main {
  void decorate(StringBuilder sb) {
    if (sb != null) {
      sb.insert(0, "[");
      sb.append("]");
    }
  }

  public static void main(String... args) {
    Main main = new Main();
    StringBuilder sb = new StringBuilder("foo");
    main.decorate(sb);
    System.out.println(sb);
  }
}
