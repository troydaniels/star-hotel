/* 32555 Star Hotel Assessment
 *
 * Shruti Rane 12760878, Anzhao Wang 12737678, Troy Daniels 12957130
*/
package starhotel;

import java.time.*;
import java.util.ArrayList;

public class Employee {
    private String name;
    private int employeeID;
    private LocalDate startDate;
    private boolean isManager;
    
    public Employee(String name, int employeeID, LocalDate startDate){
        this.setName(name);
        this.setID(employeeID);
        this.setStartDate(startDate);
    }
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
    
    void setID(int employeeID){
        this.employeeID = employeeID;
    }
    
    int getID(){
        return this.employeeID;
    }
 
    void setStartDate(LocalDate startDate){
        this.startDate = startDate;
    }
    
    LocalDate getStartDate(){
        return this.startDate;
    }
    
    boolean getIsManager(){
        return this.isManager;
    }
    
    Booking createBooking(Customer customer, Room room, LocalDate startDate, LocalDate endDate, ArrayList bookings){
        Booking tempBooking = null;
        if(!customer.getIsDefaulter() && !room.getIsOccupied()){
            String id = room.getRoomNumber() + startDate.toString();
            tempBooking = new Booking(id, startDate, endDate, customer, room);
        }
        return tempBooking;
    }
    
    Booking extendBooking(Booking booking, LocalDate newEndDate){
        return null;
    }
    
    boolean checkInCustomer(int bookingID){
        return false;
    }
    
    void setIsDefaulter(Customer customer, boolean isDefaulter){
    }

    boolean validateCredentials(Customer customer){
        //some API call here to check customer details
        return false;
    }
    
    boolean processPayment(Booking booking, float amount){
        //some API call here to process client payments
        //return true if successful, false else
        return false;
    }
    
    void cancelBooking(Booking booking){
    }
}