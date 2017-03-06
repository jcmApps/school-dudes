/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persons;

import Persons.Person;

/**
 *
 * @author jasonschwartz
 */
public class Student extends Person
{
    private String major;
    private double gpa;

    public Student()
    {
        
    }
    
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public void DisplayAll()
    {
        System.out.println("\n*******************************************");
        System.out.printf("Name: \t\t%s %s\n", getFirstName(),getLastName());
        System.out.printf("Address: \t%s\n", getAddress());
        System.out.printf("Phone #: \t%s\n", getPhone());
        System.out.printf("Major: \t\t%s\n", major);
        System.out.printf("GPA: \t\t%.2f\n", gpa);
        System.out.println("*******************************************\n");
    }
}
