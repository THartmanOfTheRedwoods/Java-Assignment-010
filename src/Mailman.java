public class Mailman {
    private String name;
    private int health = 50;

    public  Mailman(String name) {
        this.name = name;

    }

    public void bitten(String dogname) {
        System.out.println(name + "has been bitten by "+dogname);
        health= health- 5;
        ouch();

    }
    public void mauled(String dogname) {
        System.out.println(name + " has been mauled by "+dogname);
        health = health -15;
        ouch();
    }
    public void ouch() {
        System.out.println(name + " has "+health+" health remaining");
        System.out.println("Ouch");
    }

    public int getHealth() {
        return health;
    }
}
