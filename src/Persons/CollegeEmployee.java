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
public class CollegeEmployee extends Person
{
    private String ssn;
    private String department;
    private double salary;

    public CollegeEmployee()
    {
        
    }
    public String getSsn() 
    {
        return ssn;
    }

    public void setSsn(String ssn) 
    {
        this.ssn = ssn;
    }

    public String getDepartment() 
    {
        return department;
    }

    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
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
        System.out.println("*******************************************\n");
    }
}
