/**
 * The main method that creates three Dog objects and demonstrates their behaviors.
 * @author Ricky G
 */
public class main {
        public static void main(String[] args) {
        dog dog1 = new dog("Bulldog", "large", "light gray", 5);
        dog dog2 = new dog("Beagle", "large", "orange", 6);
        dog dog3 = new dog("German Shepherd", "large", "white & orange", 6);

        dog1.eat();
        dog1.run();
        dog1.sleep();
        dog1.name();

        dog2.eat();
        dog2.run();
        dog2.sleep();
        dog2.name();

        dog3.eat();
        dog3.run();
        dog3.sleep();
        dog3.name();
        }
        }
