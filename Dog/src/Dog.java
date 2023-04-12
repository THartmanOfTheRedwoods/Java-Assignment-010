/**
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since version 1.0
 */
public class Dog {
    private String breed;
    private String size;
    private String color;
    private int age;
    public Dog(String breed, String size, String color, int age){
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }
    public void eat(){
        if(this.size.equalsIgnoreCase("large")){
            System.out.println(breed + " should be on diet.");
        }
    }
    public void run(){
        System.out.println(breed + " likes to run.");

    }
    public void sleep(){
        if(age <= 5){
            System.out.println(breed + " doesn't like to sleep");
        }
        else {
            System.out.println(breed + " likes to sleep.");
        }


    }
    public void name(String name){
        System.out.printf("My name is %s and I am a %s.%n ",name,breed);
    }

}
