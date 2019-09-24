import java.util.*;

class My<T> {
  List<T> exec(T t) {
    List<T> list = new ArrayList<>();
    list.add(t);
    return list;
  }
}
