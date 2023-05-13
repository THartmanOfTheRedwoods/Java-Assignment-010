package src;

import java.util.Objects;

/**
 * @author Ander Stanley-Camba
 * @since 2023-04-16 Ver 1.0
 */

public class Dog {
    private String Breed;
    private String Size;
    private String Colour;
    private int Age;
    private double Energy;
    private String Name = "";


    public Dog(String breed,String size,String colour,int age) {
        this.Breed = breed;
        this.Size = size;
        this.Colour = colour;
        this.Age = age;
        this.Energy = 1.0;
    }

    public void Eat(String food) {

        this.Energy += .1;
        this.Energy = Math.min(this.Energy, 1.0);

        if (Objects.equals(this.Name, "")) {
            System.out.printf("\nThe unnamed %s dog ate some %s.\n", this.Breed, food);
            System.out.printf("\nThe unnamed dog's energy is now %.2f%%\n", this.Energy * 100);
        } else {
            System.out.printf("\nThe %s dog named %s ate some %s.\n", this.Breed, this.Name, food);
            System.out.printf("\nThe energy levels of %s are now %.2f%%\n", this.Name, (this.Energy * 100));
        }
    }

    public void Run(int speed, String units) {
        System.out.printf("\nSuddenly a %s, %s colored blur runs past you at %d %s!\n", this.Size, this.Colour, speed, units);
        this.Energy -= .1;
        this.Energy = Math.min(this.Energy, 1.0);
        if (Objects.equals(this.Name, "")) {
            System.out.printf("\nThe energy levels of the unnamed dog are now %.2f%%\n", this.Energy * 100);
        } else {
            System.out.printf("\nThe energy levels of %s are now %.2f%%\n", this.Name, this.Energy * 100);
        }
    }

    public void Sleep(int hours) {
        if (hours > 4) {
            this.Energy = 1.0;
        } else {
            this.Energy += (this.Energy / 4);
            this.Energy = Math.min(this.Energy, 1.0);
        }

        if (Objects.equals(this.Name, "")) {
            System.out.printf("\nThe unnamed dog slept for %d hours...\n", hours);
            System.out.printf("\nThe unnamed dog's energy levels are now %.2f%%\n", this.Energy * 100);
        } else {
            System.out.printf("\n%s slept for %d hours...\n", this.Name, hours);
            System.out.printf("\nThe energy levels of %s are now %.2f%%\n", this.Name, (this.Energy * 100));
        }
    }

    public void Name(String name) {
        this.Name = name;
        System.out.printf("\nThis dog's name is now '%s'!\n", this.Name);
    }

    public void passYears(int years) {
        System.out.printf("\n%d years have now passed...\n", years);
        this.Age += years;
        if (Objects.equals(this.Name, "")) {
            System.out.printf("\nThe unnamed dog's age is now %d human years old (that's %d in dog years)\n", this.Age, this.Age * 7 );
        } else {
            System.out.printf("\nThe age of %s is now %d human years old (that's %d in dog years)\n", this.Name, this.Age, this.Age * 7 );
        }
    }

    public void getDetails() {
        System.out.printf("\nName:   %20s\nBreed:  %20s\nSize:   %20s\nColour: %20s\nAge:%18d years\nEnergy:%20.2f%%\n",
                this.Name, this.Breed, this.Size, this.Colour, this.Age, this.Energy * 100);
    }

    public static void main(String[] args) {
        Dog Dog1Object = new Dog("Bulldog", "large", "light gray", 5);
        Dog Dog2Object = new Dog("Beagle", "large", "orange", 6);
        Dog Dog3Object = new Dog("German Shepard", "large", "white & orange", 6);


        // test
        // Dog1Object.Name("Fido");
        Dog1Object.getDetails();
        Dog1Object.Eat("kibble");
        Dog1Object.Run(5, "mph");
        Dog1Object.Sleep(3);
        Dog1Object.passYears(10);


    }
}
