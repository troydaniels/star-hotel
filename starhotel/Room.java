/* 32555 Star Hotel Assessment
 *
 * Shruti Rane 12760878, Anzhao Wang 12737678, Troy Daniels 12957130
*/
package starhotel;

public class Room {
    private RoomType type;
    private boolean isOccupied;
    private int roomNumber;
    private int floor;
    
    public Room(RoomType type, int roomNumber, int floor){
        this.setRoomType(type);
        this.setRoomNumber(roomNumber);
        this.setRoomFloor(floor);
    }
    
    void setRoomType(RoomType type){
        this.type = type;
    }
    
    RoomType getRoomType(){
        return this.type;
    }
    
    void setIsOccupied(boolean isOccupied){
        this.isOccupied = isOccupied;
    }
    
    boolean getIsOccupied(){
        return this.isOccupied;
    }
    
    void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }
    
    int getRoomNumber(){
        return this.roomNumber;
    }
    
    void setRoomFloor(int floor){
        this.floor = floor;
    }
    
    int getRoomFloor(){
        return this.floor;
    }
    
}
