import java.util.Scanner;
/**
 *
 * @author Trevor Hartman
 *
 * @since Version 1.0
 *
 * @author Colton Simpson
 *
 * @since Version 1.1
 *
 */
public class Dog {
    private String breed;
    private String size;
    private String color;
    private String name;
    private int age;
    Dog(String breed, String size, String color, String name, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(" is now eating.");

    }

    public void sleep() {
        System.out.println(" is now sleeping.");

    }

    public void run() {
        System.out.println(" is now running.");

    }
    public void changeName(String newName) {
        System.out.println(" is now called " + newName);
    }

    public static void main(String[] args) {
        Dog dog1obj = new Dog("bulldog", "large", "Grey", "testName",3);
        Dog dog2obj = new Dog("beagle", "small", "Brown", "testName", 5);
        Dog dog3obj = new Dog("German Shepard", "large", "Black", "testName", 2);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Which dog would you like to play with? (1-3)");
            int dogChoice = scanner.nextInt();

            System.out.println("what is the dog going to do?\n1) Eat\n2) Sleep\n3) Run\n4) Change it's name");
            int actionChoice = scanner.nextInt();

            Dog currentDog = null;

            switch (dogChoice) {
                case 1:
                    currentDog = dog1obj;
                    break;
                case 2:
                    currentDog = dog2obj;
                    break;
                case 3:
                    currentDog = dog3obj;
                    break;
                    default:
                        System.out.println("Invalid choice");
                        continue;
            }
                switch (actionChoice) {
                    case 1:
                        currentDog.eat();
                        break;
                    case 2:
                        currentDog.sleep();
                        break;
                    case 3:
                        currentDog.run();
                        break;
                    case 4:
                        System.out.println("Enter the new name!");
                        scanner.nextLine();
                        String newName = scanner.nextLine();
                        currentDog.changeName(newName);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            System.out.println("Press any key to continue or 'q' to quit");
            String quit = scanner.next();
            if (quit.equals("q")) {
                System.out.println("Goodbye!");
                break;

            }
        }
    }
}
