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
    
    // Extend booking if room is available for requested time
    boolean extendBooking(ArrayList<Booking> bookings, Booking booking, LocalDate newEndDate){
        boolean canExtend = true;
        if(bookings.contains(booking)){
            for(Booking b : bookings){
                // Check it's the same room, and deny if a booking starts during
                // extention period
                if(b != booking && b.getRoom() == booking.getRoom()){
                    if(b.getStartDate().isBefore(newEndDate)){
                        canExtend = false;
                        
                    }
                }
            }
            if(canExtend){
                booking.setEndDate(newEndDate);
            }
        }
        return canExtend;
    }
    
    // Check customer in - set roomBooked to true if bookingID exists
    boolean checkInCustomer(ArrayList<Room> rooms, ArrayList<Booking> bookings, String bookingID){
        boolean roomBooked = false;
        for(Booking b : bookings){
            if(b.getReservationID() == bookingID){
                for(Room r : rooms){
                    r.setIsOccupied(true);
                    roomBooked = true;
                }
            }
        }
        return roomBooked;
    }
    
    void setIsDefaulter(Customer customer, boolean isDefaulter){
        customer.setIsDefaulter(isDefaulter);
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
    
    void cancelBooking(ArrayList bookings, Booking booking){
        if(bookings.contains(booking)){
            bookings.remove(booking);
        }
    }
}