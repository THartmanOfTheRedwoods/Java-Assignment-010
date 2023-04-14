/**
 * @author Jason Carr
 * @since v1.0
 * @date 4/12/2023
 */

import java.util.Scanner;

public class Dog {
    private String breed;
    private String size;
    private String color;
    private int age;
    private int weight;
    private String name;
    private static int daysOfFood;

    public Dog(String breed, String color, String size, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public void eat() {
        if (daysOfFood > 0) {
            weight++;
            daysOfFood--;
        }
    }

    public void run() {
        weight--;
    }

    public void Sleep() {
        weight--;
    }


    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("English Bulldog", "light gray", "large", 5);
        Dog dog2 = new Dog("Beagle", "brown", "large", 6);
        Dog dog3 = new Dog("German Shepherd", "white and orange", "large", 6);

        System.out.print("Dog1 needs a name!\nName your dog: ");
        Scanner scanner = new Scanner(System.in);
        String dogName1 = scanner.nextLine();
        dog1.setName(dogName1);

        System.out.print("Dog2 needs a name!\nName your dog: ");
        String dogName2 = scanner.nextLine();
        dog2.setName(dogName2);

        System.out.print("Dog3 needs a name!\nName your dog: ");
        String dogName3 = scanner.nextLine();
        dog3.setName(dogName3);

        System.out.println("Name: " + dogName1 + ", Breed: " + dog1.breed + ", Size: " + dog1.size + ", Color: " + dog1.color + ", Age: " + dog1.age);
        System.out.println("Name: " + dogName2 + ", Breed: " + dog2.breed + ", Size: " + dog2.size + ", Color: " + dog2.color + ", Age: " + dog2.age);
        System.out.println("Name: " + dogName3 + ", Breed: " + dog3.breed + ", Size: " + dog3.size + ", Color: " + dog3.color + ", Age: " + dog3.age);
        daysOfFood = 30;
        System.out.println("You have " + daysOfFood + " days of food left!");

        String response = "y";

        while (daysOfFood > 0 && response.equals("y")) {
            System.out.print("Would you like to feed your dogs (y or n)? ");
            response = scanner.nextLine();

            if (response.equals("y")) {
                dog1.eat();
                dog2.eat();
                dog3.eat();
                System.out.println("Your dogs have been fed for the day! You have " + daysOfFood + " days of food left.");
            } else if (response.equals("n")) {
                System.out.println("You are a bad dog parent!");
            } else {
                System.out.println("Invalid response, please enter y or n.");
            }
        }
    }
}
