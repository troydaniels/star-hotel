/* 32555 Star Hotel Assessment
 *
 * Shruti Rane 12760878, Anzhao Wang 12737678, Troy Daniels 12957130
*/

package starhotel;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


class Booking {
    private String id;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Charge> charges;
    private Customer customer;
    private Room room;
    
    public Booking(String id, LocalDate startDate, LocalDate endDate, Customer customer, Room room){
        this.setReservationID(id);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.setCustomer(customer);
        this.setRoom(room);
        
    }
    
    void setReservationID(String reservationID){
        this.id = reservationID;
    }
    
    String getReservationID(){
        return this.id;
    }
    
    void setStartDate(LocalDate startDate){
        this.startDate = startDate;
    }
   
     LocalDate getStartDate(){
        return this.startDate;
    }

    void setEndDate(LocalDate endDate){
        this.endDate = endDate;
    }
   
    LocalDate getEndDate(){
       return this.endDate;
    }
   
    void addAdditionalCharges(LocalDate date, LocalTime time, String chargeType, String name, float price){
        Charge newCharge = new Charge(date, time, chargeType, name, price);
        this.charges.add(newCharge);
    }
   
    void setCustomer(Customer customer){
        this.customer = customer;
    }
   
    Customer getCustomer(){
       return this.customer;
    }
   
    void setRoom(Room room){
        this.room = room;
    }
   
    Room getRoom(){
       return this.room;
    }
}
