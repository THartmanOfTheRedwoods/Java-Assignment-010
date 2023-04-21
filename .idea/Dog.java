
/**
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 4/21/2023
 * @since version 1.0
 */

import java.util.Scanner;

public class Dog { //* Your class should be named **Dog**

    private String breed;  //  * You should have **private** instance variables/fields for all the data members.
    private String size;
    private String color;
    private int age;
    private String name;
    private static int Protein;
    private static int health;

    public Dog(String breed, String size, String color, int age) { // * You should have a **constructor** that sets the initial state of the data members via passed parameters.
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public void run() {  // * You should have 4 instance methods for eat, run, sleep, and name
        // * Make at least 2 of your methods functional (i.e. perform some action)!!!
        health--;
        System.out.println("Display how far your dog ran today.");
        String run = in.next();
        System.out.printf("I ran far today!");
    }

    public void name(String breed, String size, String color, int age) {
        this.name = name;
    }  // * You should have 4 instance methods for eat, run, sleep, and name

    public void eat() {  // * You should have 4 instance methods for eat, run, sleep, and name
        // * Make at least 2 of your methods functional (i.e. perform some action)!!!
        health++;
        System.out.println("Would you like to feed your dogs? Y or N.");
        Scanner in = new Scanner(System.in);
        if (System.in.equals('y')) {
            System.out.printf("Gnarl, growl next time it's your hand.");
            eat();
        } else System.out.println("Health of dogs decreased.");
        health--;
    }

    public void sleep(int hours, int minutes) {  // * You should have 4 instance methods for eat, run, sleep, and name
        health--;
        System.out.println("Display how long your dogs slept today.");
        String run = in.next();
        System.out.printf("I slept for %d hours and %d minutes%n", hours, minutes);
    }
    void methodForDisplay(String breed, String size, String color, int heath, int age)  // * You should have a **main** method that creates the 3 Dog objects in the diagram.
    {
        System.out.printf("The Dog's breed is: " + breed);
        System.out.println();
        System.out.printf("The Dog's size is: " + size);
        System.out.println();
        System.out.printf("The Dog's color is: " + color);
        System.out.println();
        System.out.printf("The Dog's health is: " + health);
        System.out.println();
        System.out.printf("The Dog's age is: " + age);
        System.out.println();
    }
}
