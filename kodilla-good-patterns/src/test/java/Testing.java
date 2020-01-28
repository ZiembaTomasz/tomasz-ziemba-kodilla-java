import OddNumbers.LiczbyParzyste;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Testing {
    @Test
    public void testOdd(){
        LiczbyParzyste liczbyParzyste = new LiczbyParzyste();
        ArrayList<Integer> emptyList = new ArrayList<>();
        emptyList.add(17);
        emptyList.add(10);

        ArrayList<Integer> oddList = liczbyParzyste.exterminate(emptyList);
        Assert.assertEquals(1, oddList.size());

    }
}
