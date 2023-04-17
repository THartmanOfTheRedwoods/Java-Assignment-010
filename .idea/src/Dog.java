public class Dog {
    private String name;
    private String breed;
    private String size;
    private String color;
    private int age;
    private boolean isHungry;


    public Dog(String name, String breed, String size, String color, int age, boolean isHungry) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.isHungry = isHungry;
    }

    public void eat() {
        System.out.println(name + " is eating.");
        isHungry = false;
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String stats() {
        return "Name: " + name + "\nBreed: " + breed + "\nSize: " + size + "\nColor: " + color + "\nAge: " + age + " years old";
    }

    public String name() {
        return name;
    }



    public static void main(String[] args) {
        Dog dog1 = new Dog("Ray", "Bulldog", "large", "light gray", 5, true);
        Dog dog2 = new Dog("Valdez", "Beagle", "large", "orange", 6, false);
        Dog dog3 = new Dog("Raymond", "German Shepherd", "large", "white and orange", 6, false);

        dog1.eat();
        dog2.run();
        System.out.println(dog3.name() + " is " + dog3.age + " years old.");

        System.out.println("\nDog 1:\n" + dog1.stats());
        System.out.println("\nDog 2:\n" + dog2.stats());
        System.out.println("\nDog 3:\n" + dog3.stats());
    }
}
