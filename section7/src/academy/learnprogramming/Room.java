package academy.learnprogramming;


public class Room {

    private Dimensions dimensions;
    private RoomColor color;
    private Lamp lamp;
    private Couch couch;

    public Room(Dimensions dimensions, RoomColor color, Lamp lamp, Couch couch) {
        this.dimensions = dimensions;
        this.color = color;
        this.lamp = lamp;
        this.couch = couch;
    }

    public void displayRoomDimensions() {
        dimensions.getDimensions();
    }

    public void displayRoomColors() {
        color.getRoomColor();
    }

    public void displayLampInfo() {
        lamp.getLampInfo();
    }

    public void displayCouchInfo() {
        couch.getCouch();
    }


    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(50, 20, 30);
        RoomColor color = new RoomColor(32, 58, 124);
        Lamp lamp = new Lamp("Blue", true);
        Couch couch = new Couch("Gray", 2021, false);

        Room livingRoom = new Room(dimensions, color, lamp, couch);
        livingRoom.displayRoomDimensions();
        livingRoom.displayRoomColors();
        livingRoom.displayLampInfo();
        livingRoom.displayCouchInfo();
    }
}
