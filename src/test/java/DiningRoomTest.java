import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom(2,"dining room");
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(2, diningRoom.getCapacity());
    }

    @Test
    public void canGetRoomName(){
        assertEquals("dining room", diningRoom.getRoomName());
    }


}
