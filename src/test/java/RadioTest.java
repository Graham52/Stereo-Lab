import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Grundig", "Simple Radio");
    }

    @Test
    public void canPlay(){
        assertEquals("Playing song", radio.play());
    }

}
