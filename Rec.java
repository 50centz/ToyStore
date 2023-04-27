import java.io.FileWriter;
import java.io.IOException;

public class Rec {

    public static void rec(String string){
        try(FileWriter writer = new FileWriter("Prize toys.txt", true))
            {
                writer.write(string +"\n"); 
                writer.flush();
            }
            catch(IOException ex){
                
                System.out.println(ex.getMessage());
            } 
    }
}
