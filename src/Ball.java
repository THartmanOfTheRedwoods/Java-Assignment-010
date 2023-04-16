/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */
public class Ball {

    private String type;
    private String color;
    private String owner;

    public Ball(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String whoDaOwner() {
        this.owner = "Geng";
        return this.owner;
    }
}
