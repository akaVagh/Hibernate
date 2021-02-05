/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author harsh vaghani
 */
@Entity
@Table(name = "M2O_STUDENTADDRESS")
public class StudentAddress {

    @Id
    @GeneratedValue
    private int college_id;
    private String college_address;

    public int getCollege_id() {
        return college_id;
    }

    public String getCollege_address() {
        return college_address;
    }

    public void setCollege_address(String college_address) {
        this.college_address = college_address;
    }
}
