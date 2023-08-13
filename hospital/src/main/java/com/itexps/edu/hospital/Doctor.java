/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.edu.hospital;

/**
 *
 * @author beyhan
 */
public class Doctor extends Employee{
   private String speciality;
   private String degree;
   private EmployeeType type;

    @Override
    public String toString() {
        return "Doctor{" + "speciality=" + speciality + ", degree=" + degree + ", type=" + type + '}';
    }

   
   
    public Doctor(String speciality, String degree, EmployeeType type) {
        this.speciality = speciality;
        this.degree = degree;
        this.type = type;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

 
    
    }

  
   

