public class Test {
  public interface MyInterface {
    String method();
  }

  public static class MyClass implements MyInterface {
    @Override
    public String method() {
      return "Hello world!";
    }
  }

  public static void main(String[] args) {
    System.out.println(new MyClass().method());
  }
}
