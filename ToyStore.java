

import java.util.ArrayList;

public class ToyStore {
    private static ArrayList<Toy> array = new ArrayList<>();
    

    public void addToy(Toy toy){
        array.add(toy);
    }


    public void getAllToys() {
        for (Toy toy : array) {
            System.out.println(toy.getClass().getSimpleName());
            System.out.println(toy.showToy());
        }
    }

    public static Toy getToy(int index){
        Toy toy = array.get(index);
        array.remove(index);
        return toy;
    }

    public  ArrayList<Toy> getArrayListToy(){
        return array;
    }
}
