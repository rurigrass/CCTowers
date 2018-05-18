public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private int rate;

    public Bedroom(RoomType roomType, int roomNumber){
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.rate = roomType.getRate();

    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getRoomRate(){
        return this.rate;
    }

}
