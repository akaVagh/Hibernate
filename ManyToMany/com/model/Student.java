/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author harsh vaghani
 */
@Entity
@Table(name = "M2M_STUDENT")
public class Student {

    @Id
    @GeneratedValue
    private int student_id;
    private String student_name;

    public int getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<StudentCertification> studentCertification = new HashSet<StudentCertification>(0);

    public Set<StudentCertification> getStudentCertification() {
        return studentCertification;
    }

    public void setStudentCertification(Set<StudentCertification> studentCertification) {
        this.studentCertification = studentCertification;
    }

}
