import java.util.Random;
import java.util.Scanner;

public class Dog {
    private String breed;
    private String size;
    private String color;
    private int age;
    private String name = null;
    public Dog(String breed, String size, String color, int age){
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }
    public void eat(String[] dogFood){
        Random rand = new Random();
        String eatenFood = dogFood[rand.nextInt(dogFood.length)];
        System.out.printf("%s had a hearty meal of %s.\n", getName(), eatenFood);
    }
    public void run(){

    }
    public void sleep(){
        Random rand = new Random();
        if (this.age > 7 || this.age < 2){
            System.out.printf("%s took a long snooze! %s slept for %d hours\n\n", getName(), getName(), rand.nextInt(18,21));
        }
        else{
            System.out.printf("%s took a nice rest! %s slept for %d hours\n\n", getName(), getName(),rand.nextInt(12,15));
        }
    }
    public void name(){
        Scanner in = new Scanner(System.in);
        System.out.printf("What would you like to name the %s?\n", getBreed());
        String answer = in.nextLine();
        this.name = answer;
        System.out.printf("The dog's new name is %s\n", getName());
    }
    public String getName(){
        if(this.name == null){
            return "The dog";
        }
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
}
