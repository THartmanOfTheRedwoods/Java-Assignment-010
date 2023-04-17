/**
 * A Dog class representing a dog with breed, size, color, and age.
 *
 * @author Ricky G
 */
public class dog {
    private String breed;
    private String size;
    private String color;
    private int age;

    /**
     * Constructs a Dog object with the given breed, size, color, and age.
     */
    public dog(String breed, String size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    /**
     * Represents the dog eating.
     */
    public void eat() {
        System.out.println(breed + " is eating.");
    }

    /**
     * Represents the dog running.
     */
    public void run() {
        System.out.println(breed + " is running.");
    }

    /**
     * Represents the dog sleeping.
     */
    public void sleep() {
        System.out.println(breed + " is sleeping.");
    }

    /**
     * Prints the dog's breed.
     */
    public void name() {
        System.out.println("The dog's breed is: " + breed);
    }
}



