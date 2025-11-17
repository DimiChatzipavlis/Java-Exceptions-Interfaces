
import static java.lang.Thread.sleep;

interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Run the 1st interface...");
      try {
          sleep(1000);
      } catch (InterruptedException ex) {
      }
  }
  public void myOtherMethod() {
    System.out.println("Run the 2nd interface...");
  }
}

class InterfaceExample {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
