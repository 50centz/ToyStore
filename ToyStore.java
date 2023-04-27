

import java.util.ArrayList;

public class ToyStore {
    private static ArrayList<Toy> array = new ArrayList<>();
    

    public void addToy(Toy toy){
        array.add(toy);
    }


    public static void getAllToys() {
        if (array.size() == 0){
            System.out.println("\nThere are no toys in the toy store, please add a toy\n");
        }else{
            for (Toy toy : array) {
                System.out.println(toy.getClass().getSimpleName());
                System.out.println(toy.showToy());
            }
        }
    }

    public static Toy getToy(int index){
        Toy toy = array.get(index);
        array.remove(index);
        return toy;
    }

    public static ArrayList<Toy> getArrayListToy(){
        return array;
    }
}
