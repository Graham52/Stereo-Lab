import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Technics", "1210" ,45);
    }

    @Test
    public void getVolumeTest(){
        assertEquals("Volume Lowered", recordDeck.volume());
    }

    @Test
    public void getSpeedTest(){
        assertEquals(45, recordDeck.playSpeeds());
    }

    @Test
    public void canPlayTest(){
        assertEquals("Playing Record", recordDeck.play());
    }
}
