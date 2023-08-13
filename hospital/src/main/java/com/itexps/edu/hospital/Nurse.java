/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.edu.hospital;

/**
 *
 * @author beyhan
 */
public class Nurse extends Employee {
    private String shift;

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public Nurse(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Nurse{" + "shift=" + shift + '}';
    }


}
