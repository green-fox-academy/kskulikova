public class Shifter implements CharSequence {

  private String string;

  Shifter(String string, int number) {
    this.string = string.substring(number);
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return string.subSequence(start, end);
  }

}
