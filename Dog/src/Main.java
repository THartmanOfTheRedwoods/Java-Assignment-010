/**
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bulldog","large","light gray", 5);
        Dog dog2 = new Dog("Beagle", "large", "orange", 6);
        Dog dog3 = new Dog("German Shepherd", "large", "white and orange", 6);
        dog1.name("Lili");
        dog1.eat();
        dog1.run();
        dog1.sleep();
        dog2.sleep();

    }
}