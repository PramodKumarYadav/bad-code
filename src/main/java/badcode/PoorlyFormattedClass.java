package badcode;

public class PoorlyFormattedClass {
  public static void main(String[] args) {
    System.out.println("This is a poorly formatted class");
  }

  @Override
  public String toString() {
    System.out.println("Poorly formatted toString method");
    return "PoorlyFormattedClass{}"; }}
