/**
 *
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

import java.util.Random;

public class Dog {

    private static final Random rand = new Random();

    private String breed;
    private String size;
    private String colour;
    private String age;

    private String name;
    private Time timezone;


    public Dog(String breed, String size, String colour, String age, String name, Time timezone) {

        this.breed = breed;
        this.size = size;
        this.colour = colour;
        this.age = age;

        this.name = name;
        this.timezone = timezone;

    }

    public void eat() {

        int minutesPassed = rand.nextInt(5,16);
        int secondsPassed = rand.nextInt(60);

        this.timezone.addTime(minutesPassed, secondsPassed);

        System.out.printf("You feed %s some food. %d minutes and %d seconds have passed.\n", this.name, minutesPassed, secondsPassed);

    }

    public void run() {

        int hoursPassed = rand.nextInt(3);
        int minutesPassed = rand.nextInt(60);
        int secondsPassed = rand.nextInt(60);

        this.timezone.addTime(hoursPassed, minutesPassed, secondsPassed);

        System.out.printf("You go on run with %s. %d hours, %d minutes and %d seconds have passed.\n", this.name, hoursPassed, minutesPassed, secondsPassed);


    }

    public void sleep() {

        int hoursPassed = rand.nextInt(10);
        int minutesPassed = rand.nextInt(60);
        int secondsPassed = rand.nextInt(60);

        this.timezone.addTime(hoursPassed, minutesPassed, secondsPassed);

        System.out.printf("%s falls asleep. %d hours, %d minutes and %d seconds have passed.\n", this.name, hoursPassed, minutesPassed, secondsPassed);


    }

    public void name(String newName) {

        System.out.printf("%s is now named \"%s\"\n", this.name, newName);

        this.name = newName;

    }

    public String getName() {
        return this.name;
    }

}
