
public class Toy {
    private int id;
    private String title;
    private int frequency;

    public Toy (int id, String title, int frequency){
        this.id = id;
        this.title = title;
        this.frequency = frequency;
    }

    public void setFrequency(int frequency){
        this.frequency = frequency;
    }

    public String showToy(){
        return String.format("id: %d  Title: %s  Frequency: %d %%", id, title, frequency);
    }
}
