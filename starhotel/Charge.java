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
        this.setDate(date);
        this.setTime(time);
        this.setChargeType(chargeType);
        this.setName(name);
        this.setPrice(price);
    }
    
    public void setDate(LocalDate date){
        this.date = date;
    }
    
    public LocalDate getDate(){
        return this.date;
    }
    
    public void setTime(LocalTime time){
        this.time = time;
    }
    
    public LocalTime getTime(){
        return this.time;
    }
    
    public void setChargeType(String chargeType){
        this.chargeType = chargeType;
    }
    
    public String getChargeType(){
        return this.chargeType;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public float getPrice(){
        return this.price;
    }
}

