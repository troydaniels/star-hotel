/* 32555 Star Hotel Assessment
 *
 * Shruti Rane 12760878, Anzhao Wang 12737678, Troy Daniels 12957130
*/
package starhotel;


class Customer {
    private String name;
    private Gender gender;
    private String address;
    private boolean isDefaulter;
    
    public Customer(String name, Gender gender, String address){
        this.setName(name);
        this.setGender(gender);
        this.setAddress(address);
    }
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
    
    void setGender(Gender gender){
        this.gender = gender;
    }
    
    Gender getIsGender(){
        return this.gender;
    }
    
    void setAddress(String address){
        this.address = address;
    }
    
    String getAddress(){
        return this.address;
    }
    
    boolean getIsDefaulter(){
            return this.isDefaulter;
    }
    
    void setIsDefaulter(boolean isDefaulter){
            this.isDefaulter = isDefaulter;
    }
}
