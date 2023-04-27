public class ChoosingAPrizeToy {
    

    public int choosingAPrizeToy(int num){
        int number = 0;
        boolean start = true;
        while(start){
            number = (int) (Math.random() * ++num);
            if ( number != 0){
                start = false;
            }

            
        }
        return number;
    }
}
