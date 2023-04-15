/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 */

public class Dog {
    private String breed;
    private String size;
    private String colour;
    private int age;
    private String name;

    public Dog(String breed, String size, String colour, int age, String name) {
        this.breed = breed;
        this.size = size;
        this.colour = colour;
        this.age = age;
        this.name = name;
    }

    public void eat() {
        if (this.size == "Large") {
            System.out.println("Maybe we sould lay off of the snacks for you");
        } else {
            System.out.println("Enjoy your food!");
        }
    }

    public void run() {
        if (this.age >= 6 || this.size == "Large") {
            System.out.println(this.name+" doesn't like to exercise very much these days");
        }
        else {
            System.out.println(this.name+" loves to get out an play!");
        }
    }

    public void sleep() {
        if (this.age >= 6) {
            System.out.println(this.name + " is old and very tired.");
        } else {
            System.out.println(this.name + " is young and full of energy!");
        }
    }

    public void name(String name) {
        System.out.println(this.name + " is my name and I am " + this.age + " years old.");
    }
    public static void main(String[] args) {
        Dog dog1object = new Dog("Bulldog","Large","Light Gray",5,"Ronald");
        Dog dog2object = new Dog("Beagle","Large","Orange",6,"Benny");
        Dog dog3object = new Dog("German Shepherd","Large","White & Orange",6,"Ace");

        dog1object.sleep();
        dog2object.eat();
        dog3object.run();
        dog1object.name();
    }
}