/**
 * @author crazyne55
 */
public class Dog {
    String Breed;
    String size; //String only to match the diagram, if it didn't have to be a word I'd use an integer or float or whatever.
    String Colour;
    int Age; //age in years

    public Dog(String Breed,String size,String Colour,int Age) {
        this.Breed = Breed;
        this.size = size;
        this.Colour = Colour;
        this.Age = Age;
    }

    public void Eat() {
        int rng = (int)Math.round((Math.random()*3)+1);
        switch (rng) {
            case 1:
                System.out.println(("The hungry {breed} devours the meal with gusto.").replaceAll("\\{breed}",Breed));
                break;
            case 2:
                System.out.println(("{breed} savors every morsel of food, savoring the flavors.").replaceAll("\\{breed}",Breed));
                break;
            case 3:
                System.out.println(("With a growling stomach, the {breed} eagerly consumes the meal.").replaceAll("\\{breed}",Breed));
                break;
            case 4:
                System.out.println(("The {breed} feasts heartily, relishing each bite.").replaceAll("\\{breed}",Breed));
                break;
        }
    }
    public void Run() {
        int rng = (int)Math.round((Math.random()*3)+1);
        switch (rng) {
            case 1:
                System.out.println(("The {breed} sprints with lightning speed, leaving a trail of dust in its wake.").replaceAll("\\{breed}",Breed));
                break;
            case 2:
                System.out.println(("{breed} dashes across the field, its paws barely touching the ground.").replaceAll("\\{breed}",Breed));
                break;
            case 3:
                System.out.println(("With a burst of energy, the {breed} races ahead, fueled by determination.").replaceAll("\\{breed}",Breed));
                break;
            case 4:
                System.out.println(("The {breed} runs gracefully, effortlessly covering long distances.").replaceAll("\\{breed}",Breed));
                break;
        }
    }
    public void Sleep() {
        int rng = (int)Math.round((Math.random()*3)+1);
        switch (rng) {
            case 1:
                System.out.println(("The {breed} curls up in a cozy corner and drifts off into a peaceful slumber.").replaceAll("\\{breed}",Breed));
                break;
            case 2:
                System.out.println(("{breed} finds a quiet spot and settles down, snoozing peacefully.").replaceAll("\\{breed}",Breed));
                break;
            case 3:
                System.out.println(("With a contented sigh, the {breed} closes its eyes and dozes off.").replaceAll("\\{breed}",Breed));
                break;
            case 4:
                System.out.println(("The {breed} snuggles into its bed, enjoying a well-deserved rest.").replaceAll("\\{breed}",Breed));
                break;
        }
    }
    public void Name() {
        // I don't know what I should do for this one...
    }

    public static void main(String[] args) {
        Dog Dog1Object = new Dog("Bulldog","large","light gray", 5);
        Dog Dog2Object = new Dog("Beagle","large","orange", 6);
        Dog Dog3Object = new Dog("German Shepherd","large","white & orange", 6);

        Dog1Object.Eat();
        Dog2Object.Sleep();
        Dog3Object.Run();
    } // I will update this in a while to be more interesting with a food system or whatever, currently I am just focusing on getting this assignment in on time.
}
// also I made ChatGPT write the dialog stuff for me.