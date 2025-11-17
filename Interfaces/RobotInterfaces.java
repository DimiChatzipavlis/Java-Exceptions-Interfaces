// Base interface
interface Movable {
    void move();
}

// Another base interface
interface Speakable {
    void speak(String message);
}

// Interface extending multiple interfaces (multiple inheritance)
interface SmartMachine extends Movable, Speakable {
    void recharge();
}

// A class implementing a single composite interface
class Robot implements SmartMachine {

    @Override
    public void move() {
        System.out.println("Robot is moving...");
    }

    @Override
    public void speak(String message) {
        System.out.println("Robot says: " + message);
    }

    @Override
    public void recharge() {
        System.out.println("Robot is recharging...");
    }
}
//Those are all the interfaces and classes used for the RobotExample.java file. Beware of the @Override annotation, which indicates that a method is being overridden from an interface or superclass. In other words, it ensures that the method signature matches the one defined in the interface.