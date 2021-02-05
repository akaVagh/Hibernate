/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author harsh vaghani
 */
@Entity
@Table(name="student")
public class Student {
    @Id
    private int id;
    private String name;
    private String email;
    private long mobileNo;
    private String address;

    public Student() {
    }

    public Student(int id, String name, String email, long mobileNo, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.address = address;
    }    
    
}
