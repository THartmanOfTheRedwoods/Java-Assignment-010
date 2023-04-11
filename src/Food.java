/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
public class Food {

    private int food;

    public Food(int food) {

        this.food = food;

    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int reduceFood() {

        food = food - 25;

        return food;

    }
}
