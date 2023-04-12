public class Dogs {
    public class Dog {
        private String breed;
        private String size;
        private String color;
        private int age;

        public Dog(String breed, String size, String color, int age) {
            this.breed = breed;
            this.size = size;
            this.color = color;
            this.age = age;
        }

        public void eat() {
            System.out.println("The " + breed + " is eating.");
        }

        public void run() {
            System.out.println("The " + breed + " is running.");
        }

        public void sleep() {
            System.out.println("The " + breed + " is sleeping.");
        }

        public void setName(String name) {
            System.out.println("The " + breed + " is named " + name + ".");
        }

        public static void main(String[] args) {
            Dog dog1 = new Dog("Bulldog", "Large", "Light gray", 5);
            Dog dog2 = new Dog("Beagle", "Large", "Orange", 6);
            Dog dog3 = new Dog("German shepherd", "Large", "White and orange", 6);

            dog1.setName("Max");
            dog2.eat();
            dog3.run();
        }
    }

}