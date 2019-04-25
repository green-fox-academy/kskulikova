class Sharpie {

  private String color;
  private float width;
  private float inkAmount = 100;

  Sharpie(String color, float width) {
    this.color = color;
    this.width = width;

  }

  void use() {
    this.inkAmount--;
  }

  float getInkAmount() {
    return this.inkAmount;
  }

  void useUp() {

    int initialInk = (int) this.inkAmount;
    for (int i = 0; i < initialInk; i++) {
      this.use();
    }
  }
}
