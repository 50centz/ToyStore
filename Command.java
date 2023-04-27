import java.util.ArrayList;

public class Command {
     
    public static ArrayList<String> array = new ArrayList<>();
    
    public static void showCommand(){
        String createToy = "1. Create a Toy";
        String playToys = "2. Play toys";
        String view = "3. View all the toys in the store";
        String exit = "4. Exit program";
        array.add(createToy);
        array.add(playToys);
        array.add(view);
        array.add(exit);

        for (String string : array) {
            System.out.println(string);
        }
        array.clear();
    }   
}
