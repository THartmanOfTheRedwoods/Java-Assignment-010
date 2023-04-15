/**
 * @author Adrienne van Summern
 * @since version 1.0
 */

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String[] dogFood = {"Purina dog chow", "your pizza", "puppy chow", "Blue Buffalo kibble", "Royal Canin healthy dry food", "Nutro Ultra dry dog food", "chicken"};
        Dog dalmatian = new Dog("Dalmatian", "large adult", "White with black spots", 4);
        Dog corgi = new Dog("Corgi", "short & medium sized", "tan", 8);
        Dog bulldog = new Dog("American Bulldog", "large puppy", "white and tan", 1);

        Dog[] dogs = {dalmatian, corgi, bulldog};
        System.out.println("Would you like to name the dogs? If so, enter Y");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("y")){
            dalmatian.name();
            corgi.name();
            bulldog.name();
        }
        for (Dog dog: dogs){
            dog.eat(dogFood);
            System.out.printf("Then, ");
            dog.sleep();
        }
    }
}
