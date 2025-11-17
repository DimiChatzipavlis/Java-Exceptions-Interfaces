//This example displays how to use interfaces via implementing or extending them in Java. The `Robot` class implements the `SmartMachine` interface, which extends two other interfaces: `Movable` and `Speakable`. The `main` method creates an instance of `Robot` and calls its methods to demonstrate the functionality defined by the interfaces. Compile with `javac RobotExample.java` and run with `java RobotExample`.

public class RobotExample {
    public static void main(String[] args) {
        Robot r = new Robot();
        r.move();
        r.speak("Hello!");
        r.recharge();
    }
}
