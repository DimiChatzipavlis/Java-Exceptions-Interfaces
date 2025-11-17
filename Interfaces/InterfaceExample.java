import static java.lang.Thread.sleep;
// This example demonstrates how to define and implement multiple interfaces in Java. The `DemoClass` implements two interfaces, `FirstInterface` and `SecondInterface`, each with its own method. The `main` method creates an instance of `DemoClass` and calls both methods to show how the class fulfills the contracts defined by the interfaces. Compile with `javac InterfaceExample.java` and run with `java InterfaceExample`. Caution: The `sleep` method is used here to pause execution for DEMONSTRATION ONLY purposes.

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
