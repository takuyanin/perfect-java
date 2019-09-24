@FunctionalInterface
interface F {
  void f();
}

interface BaseI {
  default void method() {
    System.out.println("method in BaseI: " + this.getValue());
  }
  String getValue();

  static void smethod() {
    System.out.println("static method in BaseI");
  }
}

class Impl implements BaseI {
  @Override
  public String getValue() {
    return "value in Impl";
  }
}

public class Main {
  public static void main(String... args) {
    BaseI bi = new Impl();
    F mref = bi::method;
    mref.f();

    mref = BaseI::smethod;
    mref.f();
  }
}
