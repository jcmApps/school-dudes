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
    CollegeEmployee emp = new CollegeEmployee();
    Faculty fac = new Faculty();
    Student stu = new Student();
    
    public SchoolDudes()//default constructor
    {
        Dude();
    }
    
    public void Dude()
    {
        int num1 = 0;
        
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
        int num2 = 0;
        String first = "";
        String last = "";
        String addy = "";
        String zip = "";
        String digits = "";
        
        do
        {
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
                    
                    System.out.println("Please enter the employee's SSN => ");
                    emp.setSsn(scan.next());
                    System.out.println("Please enter the employee's department => ");
                    emp.setDepartment(scan.next());
                    System.out.println("Please enter the employee's salary => ");
                    emp.setSalary(scan.nextDouble());
                    scan.nextLine();                    
                    
                    emp.setFirstName(first);
                    emp.setLastName(last);
                    emp.setAddress(addy);
                    emp.setPhone(digits);
                    collegeEmployee.add(emp);           
                    break;
                case 2:
//                    boolean ten = false;
                    String tenChoice = "";
                    
                    System.out.println("Please enter the employee's SSN => ");
                    fac.setSsn(scan.next());
                    System.out.println("Please enter the employee's department => ");
                    fac.setDepartment(scan.next());
                    System.out.println("Please enter the employee's salary => ");
                    fac.setSalary(scan.nextDouble());
                    scan.nextLine();
                    System.out.println("Is the employee tenured? (Y/N) => ");
                    tenChoice = scan.next().toUpperCase();                    
                    if(tenChoice.equals("Y"))
                        fac.setTenured(true);
                    scan.nextLine();
                    
                    fac.setFirstName(first);
                    fac.setLastName(last);
                    fac.setAddress(addy);
                    fac.setPhone(digits);
                    faculty.add(fac);
                    break;
                case 3:                    
                    System.out.println("Please enter the students major ==> ");
                    stu.setMajor(scan.next());
                    System.out.println("Please enter the students GPA ==> ");
                    stu.setGpa(scan.nextDouble());
                    
                    stu.setFirstName(first);
                    stu.setLastName(last);
                    stu.setAddress(addy);
                    stu.setPhone(digits);
                    student.add(stu);
                    break;
            }
            num2 = 4;
        }while(num2 < 4);
    }
    
    public void Find()
    {
        
    }
    
    public void DisplayAll()
    {
        int num3 = 0;
        Person[] persons = new Person[3];
        persons[0] = emp;
        persons[1] = fac;
        persons[2] = stu;
        
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
                persons[0].DisplayAll();
                break;
            case 2:
                System.out.println("Faculty Members:");
                persons[2].DisplayAll();
                break;
            case 3:
                System.out.println("Students:");
                persons[3].DisplayAll();
                break;
        }
        
//        for(int i = 0; i < persons.length; i++)
//         {
//             if(i == 0)
//                 System.out.println("College Employees:");
//             if(i == 1)
//                 System.out.println("Faculty Members:");
//             if (i == 2)
//                 System.out.println("Students:");
//             persons[i].DisplayAll();
//         }
//        for (CollegeEmployee collegeEmployee_1 : collegeEmployee) 
//        {
//            collegeEmployee_1.DisplayAll();
//        }
//        
//        for (Faculty faculty_1 : faculty) 
//        {
//            faculty_1.DisplayAll();
//        }
//        for (Student student_1 : student) 
//        {
//            student_1.DisplayAll();
//        }
        
            
//        Person[] manyAnimals = new Person[3];
//        manyAnimals[0] = new CollegeEmployee();
//         manyAnimals[1] = new Faculty();
//         manyAnimals[2] = new Student();
//
//
         
    }
}
