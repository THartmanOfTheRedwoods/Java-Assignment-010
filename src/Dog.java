/**
 * @author Michael Thoreson
 * @since 1.0
 */
public class Dog {
    private String breed;
    private String size;
    private String colour;
    private int age;
    private int energy;

    public Dog(String b, String s, String c, int a){
        this.breed = b;
        this.size = s;
        this.colour= c;
        this.age = a;
        this.energy = 0;

    }
    public void eat(){
        if(energy < 4){
            energy++;
            System.out.printf("your %s feels a little better now. its energy is at %d%n",breed,energy);
        }
        else System.out.println("Energy already full!");
    }
    public void run(){
        if(energy > 0){
            energy++;
            System.out.printf("your %s feels a little more tired now. its energy is at %d%n",breed,energy);
        } else { System.out.println("Too tired!");}
    }
    public void sleep(){
        if(energy < 2){
            energy = 4;
            System.out.printf("Your %s slept soundly. Energy restored!%n",breed);
        } else {System.out.println("Too excited to sleep!");}
    }
    public void name(){
        System.out.println("??");
    }
    public static void main(String args[]){
        Dog Dog1Object = new Dog("Bulldog","Large","light gray",5);
        Dog Dog2Object = new Dog("Beagle","Large","Orangegray",6);
        Dog Dog3Object = new Dog("German Shepherd", "Large", "White and Orange", 6);
    }

}
