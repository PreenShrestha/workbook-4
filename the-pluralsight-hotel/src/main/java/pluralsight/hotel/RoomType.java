package pluralsight.hotel;

public class RoomType {

    String roomType;

    public RoomType(String roomType){
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "roomType='" + roomType + '\'' +
                '}';
    }
}
