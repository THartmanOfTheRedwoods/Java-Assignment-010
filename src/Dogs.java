/**
 *
 *@authorAaronJohnson
 *
 *@sinceVersion1.0
 */
import java.util.Scanner;
    public class Dogs {
        public static void main(String[] args) {
            PuppySupplies ps = new PuppySupplies();
            Scanner in = new Scanner(System.in);
            GermanShepherd gs = new GermanShepherd();
            Beagle be = new Beagle();
            Bulldog bu = new Bulldog();
            int time = ps.getTime();
            int food = ps.getFood();
            System.out.println("Welcome to the doggo day care program!");
            while (time != 0) {
                    try{
                        System.out.println("There are 3 dogs available:");
                        System.out.printf("1). German Shepherd%n");
                        System.out.printf("2). Beagle%n");
                        System.out.printf("3). Bulldog%n");
                        System.out.print("Please select your dog by entering the corresponding number: ");
                        int x = Integer.parseInt(in.nextLine());
                        switch (x) {
                            case 1:
                                gs.name();
                                food = gs.eat(food);
                                time = gs.run(time);
                                time = gs.sleep(time);
                                break;
                            case 2:
                                be.name();
                                food = be.eat(food);
                                time = be.run(time);
                                time = be.sleep(time);
                                break;
                            case 3:
                                bu.name();
                                food = bu.eat(food);
                                time = bu.run(time);
                                time = bu.sleep(time);
                                break;
                            default:
                                System.out.println("Invalid input, please try again");
                        }
                    } catch (NumberFormatException a) {
                        System.out.println("Invalid input, please try again");
                        continue;
                    }
                }
            System.out.println("There is no more time in the day! Its time to go home!");
            }
    }
