/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.edu.hospital;

import java.util.Scanner;

/**
 *
 * @author beyhan
 */
public class Driver {
    public static void main (String args[]){
       
        //POPULATING OBJECTS
        
        Doctor d1 = new Doctor ("Eye", "MS",1,"Tom", "Smith", EmployeeType.Doctor);
        Doctor d2 = new Doctor ("Kids", "MD", 2, "Amy","Wooden", EmployeeType.Doctor);
        Nurse n1 = new Nurse ("Morning", 1, "Mary", "William", EmployeeType.Nurse);
        Nurse n2 = new Nurse ("Noon", 2, "Kary", "Ball", EmployeeType.Nurse);
        
        Department dept1 = new Department (1,"Family", DepartmentType.Orthopedic);
        dept1.getEmployeeList().add(d2);
        dept1.getEmployeeList().add(n1);
        
        Department dept2 = new Department (1, "Kids", DepartmentType.Pediatric);
        dept2.getEmployeeList().add(d1);
        dept2.getEmployeeList().add(n2);
   
        
        Hospital h1 = new Hospital (1,"ABS Hospital" );
        h1.getDepartmentList().add(dept1);
        h1.getDepartmentList().add(dept2);
        
          System.out.println(h1);
        int choice = 0;
        do {
            System.out.println("1 depart");
            System.out.println("2 employee");
            System.out.println("3 hospital");
            System.out.println("4 exit");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice){
               
                case 1: System.out.println(h1.getDepartmentList()); break;
                case 2:
                    for (Department d : h1.getDepartmentList()) {
                        System.out.println(d.getEmployeeList());
                    }
                     break;
                case 3: System.out.println(h1);   break;
               
            }
           
        }while (choice != 4);
        
        
  
    
    }    
        }