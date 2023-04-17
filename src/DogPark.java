/**
 *
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class DogPark {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<Dog> dogList = new ArrayList<Dog>();
    private static final List<String> aliasList = new ArrayList<String>();
    private static final Time timezone = new Time();


    private static void newDog() {

        System.out.print("What breed is this dog? ");
        String breed = sc.nextLine();

        System.out.print("How large is this dog? ");
        String size = sc.nextLine();

        System.out.print("What colour is this dog? ");
        String colour = sc.nextLine();

        System.out.print("How old is this dog? ");
        String age = sc.nextLine();

        System.out.print("What is this dog's name? ");
        String name = sc.nextLine();

        dogList.add( new Dog(breed, size, colour, age, name, timezone) );
        aliasList.add( name );

        System.out.printf("\nNew dog %s has been added.\n", name);

    }

    private static void feedDog() {

        boolean running = true;
        int dog = 0;

        while (running) {

            System.out.print("Which dog do you want to feed? Name: ");
            String dogName = sc.nextLine();
            dog = aliasList.indexOf(dogName);

            if (dog == -1) {
                System.out.printf("%s is not one of your dogs.\n\n", dogName);
            } else {
                running = false;
            }

        }

        dogList.get(dog).eat();

    }

    private static void walkDog() {

        boolean running = true;
        int dog = 0;

        while (running) {

            System.out.print("Which dog do you want to walk? Name: ");
            String dogName = sc.nextLine();
            dog = aliasList.indexOf(dogName);

            if (dog == -1) {
                System.out.printf("%s is not one of your dogs.\n\n", dogName);
            } else {
                running = false;
            }

        }

        dogList.get(dog).run();

    }

    private static void sleepDog() {

        boolean running = true;
        int dog = 0;

        while (running) {

            System.out.print("Which dog do you want to send to sleep? Name: ");
            String dogName = sc.nextLine();
            dog = aliasList.indexOf(dogName);

            if (dog == -1) {
                System.out.printf("%s is not one of your dogs.\n\n", dogName);
            } else {
                running = false;
            }

        }

        dogList.get(dog).sleep();

    }

    public static void renameDog() {

        boolean running = true;
        int dog = 0;

        while (running) {

            System.out.print("Which dog do you want to rename? Name: ");
            String dogName = sc.nextLine();
            dog = aliasList.indexOf(dogName);

            if (dog == -1) {
                System.out.printf("%s is not one of your dogs.\n\n", dogName);
            } else {
                running = false;
            }

        }

        System.out.print("What do you want to rename your dog to? ");
        String newName = sc.nextLine();
        System.out.println();

        dogList.get(dog).name(newName);
        aliasList.set(dog,newName);

    }

    public static void main(String[] args) {

        String input = "";

        System.out.println("\nWelcome to the Dog Park! Have fun managing your dogs and the time!");

        // If you try to do an action with a dog before you make any dogs, then you'll be locked into a loop, which isn't the best thing to do, but I think I'm satisfied enough with this.

        while ( !(input.equalsIgnoreCase("q")) ) {

            System.out.println("\nN) Get new dog\nF) Feed a dog\nW) Walk a dog\nS) Send a dog to sleep\nR) Rename a dog\nT) Check the time\nQ) Quit\n");
            System.out.print("What do you want to do? ");
            input = sc.nextLine().toLowerCase();
            System.out.println();

            switch (input) {

                case "n" -> newDog();
                case "f" -> feedDog();
                case "w" -> walkDog();
                case "s" -> sleepDog();
                case "r" -> renameDog();
                case "t" -> System.out.println(timezone);
                case "q" -> System.out.println("See you later!");
                default -> System.out.printf("%s wasn't an option, please choose one of the options\n", input);

            }

        }

    }

}
