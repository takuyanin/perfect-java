class Owner<E> {
  private E element;
  E get() {
    return element;
  }
  void put(E element) {
    this.element = element;
  }
}
