package OddNumbers;

import java.util.ArrayList;
import java.util.List;

public class LiczbyParzyste {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer>odds = new ArrayList<>();
        int temporaryValue = 0;
        for(int n = 0; n<numbers.size(); n++){
            temporaryValue = numbers.get(n);
            if(temporaryValue % 2 == 0){
                odds.add(temporaryValue);
            }
        }
        return odds;

    }
}
