import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Technics", "1210" ,3);
    }

    @Test
    public void hasNumberOfCDS(){
        assertEquals(3, cdPlayer.numberOfCDS());
    }
}
