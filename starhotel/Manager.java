/* 32555 Star Hotel Assessment
 *
 * Shruti Rane 12760878, Anzhao Wang 12737678, Troy Daniels 12957130
*/
package starhotel;

import java.time.LocalDate;


public class Manager extends Employee {
    
    public Manager(String name, int employeeID, LocalDate startDate){
       super(name, employeeID, startDate);
    }
    
    void OverrideIDRequire(int bookingID, Customer customer){
    }
    
    void giveDiscount(Booking booking, float amount, int percent){
    }
    
    float getDailySalesTotals(){
        return 0;
    }
    
    void getRoomAvailability(){
    }
    
    void getPercentageOccupied(RoomType type, LocalDate startDate, LocalDate endDate){
    }
    
    void getPercentageOccupied(int floor, LocalDate startDate, LocalDate endDate){
    }
}
