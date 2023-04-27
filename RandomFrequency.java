public class RandomFrequency {
    

    public static int randomFrequency(){

        int max = 100;

        int number = 0;
        boolean start = true;
        while(start){
            number = (int) (Math.random() * ++max);
            if ( number != 0){
                start = false;
            }

            
        }
        return number;
    }
}
