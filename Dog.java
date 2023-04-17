import java.util.Scanner;
public class Dog {
    Scanner scanner = new Scanner(System.in);
    private String breed, String size, String color;
    private int age;
    public Dog(String b, String si, String c,int a){
        breed = b;
        size = si;
        color = c;
        age = a;
        String name = "dog";
    }
    public void eat(){
        System.out.println("The dog consumes sustenance and grows in size, he is now large.");
        size = "large"
    }
    public void run(){
        System.out.println("The dog runs away before returning shortly. ");
    }
    public void sleep(){
        System.out.println("The dog sleeps and time passes, it gains one unit of age.");
        age = age + 1;
    }
    public void name(){
        System.out.println("Name your dog.");
        name = scanner.inNextLine();
    }
    public void dogInfo(){
        System.out.println("The dog is " + size + "\n they are "+ age " years old.\n" +"They are  "+ color +"\n Their breed is "+ breed + ".\n");
    }
    public static void main(String[] args){
        Dog dog1 = new Dog("Bulldog", "large", "light gray", 5);
        Dog dog2 = new Dog("Beagle", "large", "orange", 6);
        Dog dog3 = new Dog("German Shepard", "large", "white and orange", 6);
        dog1.run();
        dog1.name();
        dog1.eat();
        dog1.sleep();
        dog1.dogInfo();
    }

}
