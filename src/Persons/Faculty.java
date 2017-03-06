/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persons;

import Persons.CollegeEmployee;

/**
 *
 * @author jasonschwartz
 */
public class Faculty extends CollegeEmployee
{
    boolean tenured;
    
    public Faculty()
    {
        
    }
    
    public boolean getTenured() 
    {
        return tenured;
    }

    public void setTenured(boolean tenured) 
    { 
        this.tenured = tenured;
    }
    
    @Override
    public void DisplayAll()
    {
        System.out.println("\n*******************************************");
        System.out.printf("Name: \t\t%s %s\n", getFirstName(),getLastName());
        System.out.printf("Address: \t%s\n", getAddress());
        System.out.printf("Phone #: \t%s\n", getPhone());
        System.out.printf("SSN: \t\t%s\n", getSsn());
        System.out.printf("Department: \t%s\n", getDepartment());
        System.out.printf("Salary: \t%.2f\n", getSalary());
        System.out.printf("Tenured: \t%s\n", tenured);
        System.out.println("*******************************************\n");
    }
}
