/**
 *
 *@authorAaronJohnson
 *
 *@sinceVersion1.0
 */
import java.util.Scanner;

public class GermanShepherd {
    private String breed;
    private String size;
    private String color;
    private int age;
    private String name;
    Scanner in = new Scanner(System.in);
    public GermanShepherd(){
        this.breed = "German Shepherd";
        this.size = "Large";
        this.color = "White and Orange";
        this.age = 6;
        this.name = breed;
    }
    public int eat(int x){
        if (x != 0) {
            System.out.printf("You give %s some food!%n", name);
            System.out.printf("%s chomps a bowl of food!%n", name);
            x--;
        } else {
            System.out.println("You don't have any more food!");
        }
        return (x);
    }
    public int run(int x){
        if (x > 0) {
        System.out.printf("You take %s outside for an hour%n", name);
        x--;
        } else {
            System.out.println("You're out of time!");
        }return x;
    }
    public int sleep(int x){
        if (x > 0) {
            System.out.printf("%s lays down on your lap for a nap%n", name);
            x--;
        } else {
            System.out.println("You're out of time!");
        }return x;
    }
    public void name(){
        System.out.print("Please enter a name for your dog: ");
        name = in.nextLine();
    }
}
