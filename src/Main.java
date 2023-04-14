public class Main {
    public static void main(String[] args)
    {
        Mailman Greg = new Mailman("Greg");
        Dog Clifford = new Dog("unknown", "Big", "red", 4);
        Dog Beagle = new Dog("beagle", "large", "orange", 6);
        Dog Pitbull = new Dog("Pitbull", "large", "light grey", 5);

        Clifford.name("Clifford");
        Clifford.sleep();
        Clifford.run();

        Clifford.kill(Greg);


    }
}
