public class ConferenceRoom extends Room{

    private String roomName;
    private double roomRate;

    public ConferenceRoom(int capacity, String roomName, double roomRate){
        super(capacity);
        this.roomName = roomName;
        this.roomRate = roomRate;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public double getRoomRate() {
        return this.roomRate;
    }

}
