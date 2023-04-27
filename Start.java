import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    
    

    public static void start(){
        boolean start = true;
        Scanner in = new Scanner(System.in);
        
        while(start){
            Command.showCommand();
            int choice = in.nextInt();
            
            if (choice == 1){
                CreateToy.createToy();
            }
            if (choice == 2){
                ArrayList<Toy> array = new ArrayList<>();
                array = ToyStore.getArrayListToy();
                DrawingOfToys.drawingOfToys(array);
            }
            if( choice == 3){
                ToyStore.getAllToys();
            }
            if (choice == 4){
                start = false;
            }
            continue;
        }
        in.close(); 
    }
}   
