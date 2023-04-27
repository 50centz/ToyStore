import java.util.ArrayList;

public class DrawingOfToys {
    
    

    public static void drawingOfToys(ArrayList<Toy> array){
        
        int length = array.size();
        if ( length == 0){
            System.out.println("\nThere are no toys in the toy store, please add a toy\n");
        }else{
            ChoosingAPrizeToy choosingAPrizeToy = new ChoosingAPrizeToy();
            int index = choosingAPrizeToy.choosingAPrizeToy(length);
            Toy toy = ToyStore.getToy(index);
            String str = toy.showToy();
            Rec.rec(str);
        }
    }
}
