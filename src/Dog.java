public class Dog {
    private String breed;
    private String size;
    private String color;

    private String name;
    private int age;

    public Dog(String breed, String size, String color, int age) {
        breed = this.breed;
        size = this.size;
        color = this.color;
        age = this.age;
    }

    public void bite(Mailman m) {
        m.bitten(name);
    }
    public void maul(Mailman m) {
        m.mauled(name);
    }
    public void name(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println( name + " is running");
    }
    public void sleep() {
        System.out.println( name + " is sleeping");
    }

    public void kill(Mailman m) {
        maul(m);
        while(m.getHealth() > 0) {
            bite(m);
        }

    }

}
