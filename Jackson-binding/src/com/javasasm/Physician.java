package com.javasasm;
public class Physician {

    //instance variables
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String npi;
    private String practiceName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;

    //getter methods
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getNpi() {
        return npi;
    }
    public String getPracticeName() {
        return practiceName;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZip() {
        return zip;
    }
    public String getPhone() {
        return phone;
    }
   
    //setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setNpi(String npi) {
        this.npi = npi;
    }
    public void setPracticeName(String practiceName) {
        this.practiceName = practiceName;
    }
    public void setAddress(String address) {
        this.address = address;
   }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    //show all physician data
    public String toString(){
        return "Physician [ firstName: "+firstName+", lastName: "+ lastName+ ", dateOfBirth: "
        + dateOfBirth+ ", npi: "+ npi+ ", practiceName: "+ practiceName+ ", address: "+ address+ ", city: "
        + city+ ", state: "+ state+ ", zip: "+ zip+ ", phone: "+ phone+ " ]";
    }
}