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
public class Hospital {
    private int id;
    private String name;
    private ArrayList<Department> departmentList = new ArrayList <Department> ();

    public Hospital(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hospital{" + "id=" + id + ", name=" + name + ", departmentList=" + departmentList + '}';
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

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }
    
}
