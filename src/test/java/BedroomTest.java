import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE,2);
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(2, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void  canGetRoomRate(){
        assertEquals(10, bedroom.getRoomRate());
    }
}
