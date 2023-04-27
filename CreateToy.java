import java.util.Scanner;

public class CreateToy {

    private static int id = 1;
    private static int frequency;

    public static void createToy(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the toy");
        String title = in.nextLine();
        frequency = RandomFrequency.randomFrequency();
        Toy toy = new Toy(id, title, frequency);
        ToyStore toyStore = new ToyStore();
        toyStore.addToy(toy);
        id += 1; 
    }

}
