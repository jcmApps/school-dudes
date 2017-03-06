/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schwartz_schooldudes;

import java.util.*;
import Persons.*;


/**
 *
 * @author jasonschwartz
 */
public class SchoolDudes 
{
    Scanner scan = new Scanner(System.in);
    
    ArrayList<CollegeEmployee> collegeEmployee = new ArrayList<>();
    ArrayList<Faculty> faculty = new ArrayList<>();
    ArrayList<Student> student = new ArrayList<>();
    CollegeEmployee emp;
    Faculty fac;
    Student stu;
    
    public SchoolDudes()//default constructor
    {
        Dude();
    }
    
    public void Dude()
    {
        int num1;
        
        do
        {
            System.out.println("Make a selection from following:");
            System.out.println("\t1. AddDude");
            System.out.println("\t2. Find");
            System.out.println("\t3. DisplayAll");
            System.out.println("\t4. Exit");
            num1 = scan.nextInt();
            scan.nextLine();
            switch(num1)
            {
                case 1:
                    AddDude();
                    break;
                case 2:
                    Find();
                    break;
                case 3:
                    DisplayAll();
                    break;
            }
        }while(num1 != 4);
    }
    
    public void AddDude()
    {
        int num2;
        String first;
        String last;
        String addy;
        String zip;
        String digits;
        
        System.out.println("Select an option to input info:");
        System.out.println("\t1. College Employee");
        System.out.println("\t2. Faculty Member");
        System.out.println("\t3. Student");
        num2 = scan.nextInt();
        scan.nextLine();

        System.out.printf("Enter first name => ");
        first = scan.nextLine();

        System.out.printf("Enter last name => ");
        last = scan.nextLine();

        System.out.printf("Enter your address => ");
        addy = scan.nextLine();

        System.out.printf("Enter your zip code => ");
        zip = scan.nextLine();

        System.out.printf("Enter your phone number => ");
        digits = scan.nextLine();

        switch(num2)
        {
            case 1:  
                emp = new CollegeEmployee();

                System.out.printf("Please enter the employee's SSN => ");
                emp.setSsn(scan.next());
                System.out.printf("Please enter the employee's department => ");
                emp.setDepartment(scan.next());
                System.out.printf("Please enter the employee's salary => ");
                emp.setSalary(scan.nextDouble());
                scan.nextLine();

                emp.setFirstName(first);
                emp.setLastName(last);
                emp.setAddress(addy);
                emp.setZipCode(zip);
                emp.setPhone(digits);
                collegeEmployee.add(emp);           
                break;
            case 2:
                fac = new Faculty();
                String tenChoice;

                System.out.printf("Please enter the employee's SSN => ");
                fac.setSsn(scan.next());
                System.out.printf("Please enter the employee's department => ");
                fac.setDepartment(scan.next());
                System.out.printf("Please enter the employee's salary => ");
                fac.setSalary(scan.nextDouble());
                scan.nextLine();
                System.out.printf("Is the employee tenured? (Y/N) => ");
                tenChoice = scan.next().toUpperCase();                    
                if(tenChoice.equals("Y"))
                    fac.setTenured(true);
                scan.nextLine();

                fac.setFirstName(first);
                fac.setLastName(last);
                fac.setAddress(addy);
                fac.setZipCode(zip);
                fac.setPhone(digits);
                faculty.add(fac);
                break;
            case 3:
                stu = new Student();

                System.out.printf("Please enter the students major ==> ");
                stu.setMajor(scan.next());
                System.out.printf("Please enter the students GPA ==> ");
                stu.setGpa(scan.nextDouble());

                stu.setFirstName(first);
                stu.setLastName(last);
                stu.setAddress(addy);
                stu.setZipCode(zip);
                stu.setPhone(digits);
                student.add(stu);
                break;
        }
    }
    
    public void Find()
    {
        String search;
        
        System.out.printf("Enter first name of person you wish to find.");
        search = scan.nextLine();
        
        System.out.printf("\nYour search returned this entry,");
        
        for (CollegeEmployee collegeEmployee_1 : collegeEmployee)
            if(collegeEmployee_1.getFirstName().equals(search))
                collegeEmployee_1.DisplayAll();
        
        for (Faculty faculty_1 : faculty)
            if(faculty_1.getFirstName().equals(search))
                faculty_1.DisplayAll();
        
        for (Student student_1 : student)
            if(student_1.getFirstName().equals(search))
                student_1.DisplayAll();
    }
    
    public void DisplayAll()
    {
        int num3;
        
        System.out.println("Which group would you like to display?");
        System.out.println("\t1. College Employees");
        System.out.println("\t2. Faulty");
        System.out.println("\t3. Students");
        num3 = scan.nextInt();
        scan.nextLine();
        
        switch(num3)
        {
            case 1:
                System.out.println("College Employees:");
                for (CollegeEmployee collegeEmployee_1 : collegeEmployee)
                    collegeEmployee_1.DisplayAll();
                break;
            case 2:
                System.out.println("Faculty Members:");
                for (Faculty faculty_1 : faculty)
                    faculty_1.DisplayAll();
                break;
            case 3:
                System.out.println("Students:");
                for (Student student_1 : student)
                    student_1.DisplayAll();
                break;
        }         
    }
}
