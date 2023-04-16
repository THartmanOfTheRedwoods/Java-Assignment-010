/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */
public class Food {

    private String name;
    private int weight;

    public Food(String name, int weight) {

        this.name = name;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void decreaseWeight() {

        System.out.println("Food weight " + weight + " lbs");
        System.out.println("Process of eating commenced");
        weight--;
        System.out.println("Food now weighs " + weight + " lbs");
        System.out.println(" ");

    }
}