/* 32555 Star Hotel Assessment
 *
 * Shruti Rane 12760878, Anzhao Wang 12737678, Troy Daniels 12957130
*/
package starhotel;

import java.time.LocalDate;
import java.time.LocalTime;


public class Charge {
    private LocalDate date;
    private LocalTime time;
    private String chargeType;
    private String name;
    private float price;
            
    public Charge(LocalDate date, LocalTime time, String chargeType, String name, float price){
    }
    
    void setDate(LocalDate date){    
    }
    
    LocalDate getDate(){
        return this.date;
    }
    
    void setTime(LocalTime time){
    }
    
    LocalTime getTime(){
        return this.time;
    }
    
    void setChargeType(String chargeType){
    }
    
    String getChargeType(){
        return this.chargeType;
    }
    
    void setName(String name){
    }
    
    String getName(){
        return this.name;
    }
    
    void setPrice(float price){
    }
    
    float getPrice(){
        return this.price;
    }
}
