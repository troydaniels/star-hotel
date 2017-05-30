/* 32555 Star Hotel Assessment
 *
 * Shruti Rane 12760878, Anzhao Wang 12737678, Troy Daniels 12957130
*/
package starhotel;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Hotel {
    private String name;
    private String streetAddress;
    private ArrayList<Employee> employees;
    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings;
    private ArrayList<Customer> customers;
    
    
    public Hotel(String name, String address){
        this.setName(name);
        this.setAddress(address);
        employees = new ArrayList<Employee>();
        rooms = new ArrayList<Room>();
        bookings = new ArrayList<Booking>();
        customers = new ArrayList<Customer>();
    }
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
    
    void setAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }
    
    String getStreetAddress(){
        return this.streetAddress;
    }
    
    Employee createEmployee(String name, int employeeID, LocalDate startDate){
        return new Employee(name, employeeID, startDate);
    }
    
    void removeEmployee(int employeeID){
    }
    
    ArrayList getEmployees(){
        return this.employees;
    }
    
    ArrayList getRooms(){
        return this.rooms;
    }
    
    ArrayList getCustomers(){
        return this.customers;
    }
    
    void setSalary(Employee employee, float newSalary){
    }
    
    void setAsManager(Employee employee, boolean isManager){
    }
    
    public static void main(String args[]){
        Hotel starHotel = new Hotel("Star Hotel", "1 Drive Way, Sheffield");
        
        System.out.println("Hotel name: " + starHotel.getName());
        System.out.println("Hotel address: " + starHotel.getStreetAddress() + "\n");
        
        Employee tempEmployee = starHotel.createEmployee("Steve", 1, LocalDate.of(2017, Month.JANUARY, 1));
        starHotel.employees.add(tempEmployee);
        
        for(Employee e : starHotel.employees){
            System.out.println("Employee name: " + e.getName());
            System.out.println("Employee id: " + e.getID());
            System.out.println("Is manager: " + e.getIsManager() + "\n");
        }
        
        Customer tempCustomer = new Customer("Annie", Gender.female, "10 Other Way, Cambridge");
        starHotel.customers.add(tempCustomer);
        
        for(Customer c : starHotel.customers){
            System.out.println("Customer name: " + c.getName());
            System.out.println("Customer address: " + c.getAddress());
            System.out.println("Is defaulter: " + c.getIsDefaulter() + "\n");
        }
        
        Room tempRoom = new Room(RoomType.penthouse, 333, 3);
        starHotel.rooms.add(tempRoom);
        
        for(Room r : starHotel.rooms){
            System.out.println("Room type: " + r.getRoomType());
            System.out.println("Room number: " + r.getRoomNumber());
            System.out.println("Room floor: " + r.getRoomFloor() + "\n");
        }
        
        System.out.println("***attempt to book room***\n\n");

        Booking booking = tempEmployee.createBooking(tempCustomer, tempRoom, LocalDate.now(), LocalDate.now(), starHotel.bookings);
        
        if(booking != null){
            System.out.println("Booking Success!");
            starHotel.bookings.add(booking);
            for(Booking b : starHotel.bookings){
                System.out.println("Booking ID: " + booking.getReservationID() + "\n");
            }
        }
    
    }
}
