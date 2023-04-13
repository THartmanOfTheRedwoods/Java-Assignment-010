/**
 * @author MK Ripley
 * @since Version 1.0
 * 04/12/2023
 **/

import java.util.Scanner;
public class Dogs {
    private String breed;
    private String size;
    private String color;
    private int age;
   public Dogs(String breed, String size, String color, int age){
       this.breed = breed;
       this.size = size;
       this.color = color;
       this.age = age;
    }
    public void eat() {
        Scanner s = new Scanner(System.in);
        System.out.println("What would you like you feed your dog?");
        String food = s.nextLine();
        if(this.size.equals("large")){
            System.out.println("Your dog eats all of it!");
        }
        else {
            System.out.println("Your dog eats a little bit of" + food);
        }

    }
    public void run() {
        if(this.size.equals("large")){
            System.out.println("Your dog goes lumbering around.");
        }
        else {
            System.out.println("Your dog goes scurrying around.");
        }
    }
    public void sleep() {
        Scanner s = new Scanner(System.in);
        System.out.println("How long many hours would you like to sleep for?");
        int nap = Integer.parseInt(s.nextLine());
        System.out.printf("Slept for %d hours\n", nap);
    }
    public void name() {
        Scanner s = new Scanner(System.in);
        System.out.println("What would you like to name this dog?");
        String name = s.nextLine();
        System.out.printf("This dog is named " + name + "\n");
    }

    public static void main(String[] args) {

        Dogs Dog1Object = new Dogs("Bulldog", "large", "light gray", 5);
        Dogs Dog2Object = new Dogs("Beagle", "large", "orange", 6);
        Dogs Dog3Object = new Dogs("German Shepherd", "large", "white & orange", 6);

        Dog1Object.sleep();
        Dog2Object.run();
        Dog3Object.name();
        Dog2Object.eat();
    }
}
