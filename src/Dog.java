/**
 * @author Mike Quist
 * @date 04/12/2023
 */

public class Dog {
    private String name;
    private String breed;
    private String size;
    private String color;
    private int age;
    private boolean isHungry;

    public Dog(String name, String breed, String size, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.isHungry = true;
    }

    public void eat() {
        if (isHungry) {
            System.out.println(name + " is eating.");
            isHungry = false;
        } else {
            System.out.println(name + " is not hungry.");
        }
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Dog dog1Object = new Dog("Buddy", "Bulldog", "Large", "light gray", 5);
        Dog dog2Object = new Dog("Max", "Beagle", "Large", "orange", 6);
        Dog dog3Object = new Dog("Charlie", "German Shepherd", "Large", "white & orange", 6);

        dog1Object.eat();
        dog2Object.run();
        dog3Object.sleep();
    }
}
