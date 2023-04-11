/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */

import java.util.Random;
import java.util.Scanner;

public class Dog { // Class named Dog

    public Scanner in = new Scanner(System.in);
    // Instance variables
    private String breed;

    private String size;

    private String colour;

    private int age;

    // Constructor to initialize and allow access to Instance Variables
    public Dog(String breed, String size, String colour, int age) {

        this.breed = breed;

        this.size = size;

        this.colour = colour;

        this.age = age;

    }

    public void eat() { // Dog eats food from Class Food

        Food foodObj = new Food(100);

        System.out.println("There are " + foodObj.getFood() + " Ibs of dog food");

        System.out.println("NOM NOM NOM");

        System.out.println(foodObj.reduceFood() + " Ibs of dog food left");


    }

    // Method that generates a random number between 0 - 50 and uses that as the distance the dog will run after
    // a user entered String name
    public void run() {

        System.out.println("What would you like to throw for the dog to chance? ");

        String chaseThing = in.next();

        Random random = new Random();

        int chaseDistance = random.nextInt(50);

        for (int i = 0; i < chaseDistance; i++) {
            System.out.println("Gotta catch the " + chaseThing);
        }

    }

    // Method for exiting called sleep
    public void sleep() {

        System.out.println("Zzzzzzzzzzzzzz");
        System.exit(0);

    }

    // Method for calling the dog by an entered name and tests to see if that dog will come to tha name called
    public void name() {

        System.out.println("Enter Dog's actual name: ");

        String actualDogName = in.next();

        System.out.println("Enter Dog's name to be called: ");

        String dogName = in.next();

        System.out.println("Come " + dogName + "!");

        if (actualDogName.equals(dogName)) {

            System.out.println("Bark! Bark!");
        } else {

            System.out.println("...");

        }

    }

    // Method for testing object Instance Variables
    void methodForDisplay()
    {
        System.out.printf("The Dog's breed is: " + breed);
        System.out.println();
        System.out.printf("The Dog's size is: " + size);
        System.out.println();
        System.out.printf("The Dog's colour is: " + colour);
        System.out.println();
        System.out.printf("The Dog's age is: " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        Dog Dog1Object = new Dog("Bulldog", "large", "light gray", 5);

        Dog Dog2Object = new Dog("Beagle", "large", "orange", 6);

        Dog Dog3Object = new Dog("German Shepherd", "large", "white & orange", 6);

        Dog1Object.methodForDisplay();

        Dog2Object.methodForDisplay();

        Dog3Object.methodForDisplay();

        Dog1Object.eat();

        Dog1Object.run();

        Dog1Object.name();


    }

}
