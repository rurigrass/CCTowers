import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(20,"conference room",100);
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(20, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetRoomName(){
        assertEquals("conference room", conferenceRoom.getRoomName());
    }

    @Test
    public void canGetRoomRate(){
        assertEquals(100, conferenceRoom.getRoomRate(), 0.1);
    }

}
