/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persons;

/**
 *
 * @author jasonschwartz
 */
abstract public class Person 
{
    private String firstName;
    private String lastName;
    private String address;
    private String zipCode;
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    /**
     *
     */
    public void DisplayAll()
    {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);
        System.out.println(zipCode);
        System.out.println(phone);
    }
    
}
