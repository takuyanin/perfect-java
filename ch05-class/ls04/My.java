class My {
  private My() {}

  static My getInstance() {
    My my = new My();
    return my;
  }
}
