/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */
public class Dog {

    private String breed;
    private String size;
    private String color;
    private int age;
    private int weight;

    private String name;

    public Dog(String breed, String size, String color, int age, String name, int weight) {

        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.name = name;
        this.weight = weight;

    }

    public void eat(Food food) {

        System.out.println(name + " is eating " + food.getName() + ".");

        food.decreaseWeight();

    }

    public void run() {

        System.out.println(name + " is running like Joseph Joestar");

    }

    public void sleep() {

        System.out.println(name + " is sleeping like a kitten, for some reason...");
        bork();
        System.out.println(" ");

    }

    public String getName() {
        return name;
    }

    public void bork() {
        System.out.println(name + " is barking because they're having a strange dream");
    }

    public void fetch(Ball ball) {

        System.out.println(name + " is fetching the ball.");

        System.out.println(name + " returns that ball to " + ball.whoDaOwner());
        System.out.println(" ");

    }

    public static void main(String[] args) {

        Dog cat1 = new Dog("Pomsky", "Small", "Gray & White", 3, "Mikael", 20);
        Dog cat2 = new Dog("German Shepherd", "Large", "Tan", 6, "Ronnie", 80);
        Dog cat3 = new Dog("Shiba Inu", "Small", "Golden/Yellow", 2, "Yuri", 20);

        Food kibble = new Food("Kibble", 5);

        Ball ball1 = new Ball("Tennis", "Green");

        cat1.eat(kibble);
        cat2.run();
        cat2.fetch(ball1);
        cat3.sleep();
        System.out.println("The dogs' names are " + cat1.getName() + ", " + cat2.getName() + ", and " + cat3.getName() + ".");

    }
}
