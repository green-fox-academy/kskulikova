
public class Gnirts implements CharSequence {

  private String string;

  Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(this.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return string.subSequence(this.length() - end - 1, this.length() - start);
  }
}
