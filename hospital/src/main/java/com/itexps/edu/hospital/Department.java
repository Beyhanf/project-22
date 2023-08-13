/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.edu.hospital;

import java.util.ArrayList;

/**
 *
 * @author beyhan
 */
public class Department {
    private int id;
    private String name;
    private DepartmentType type;
    private ArrayList <Employee> EmployeeList = new ArrayList <Employee> ();

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + ", type=" + type + ", EmployeeList=" + EmployeeList + '}';
    }

   
    
    public Department(int id, String name, DepartmentType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentType getType() {
        return type;
    }

    public void setType(DepartmentType type) {
        this.type = type;
    }

    public ArrayList<Employee> getEmployeeList() {
        return EmployeeList;
    }

    public void setEmployeeList(ArrayList<Employee> EmployeeList) {
        this.EmployeeList = EmployeeList;
    }


}
