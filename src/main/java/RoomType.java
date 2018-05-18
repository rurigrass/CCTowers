public enum RoomType  {

    SINGLE(1, 10),
    DOUBLE(2, 20);

    private final int capacity;
    private final int rate;

    RoomType(int capacity, int rate){
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getRate(){
        return rate;
    }



}
