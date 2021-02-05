/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.model.Student;
import com.model.StudentAddress;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author harsh vaghani
 */
public class Main {

    public static void main(String[] args) {
        StudentAddress studentAddress = new StudentAddress();
        studentAddress.setCollege_address("D D University, Nadiad");
        Student student1 = new Student();
        student1.setStudent_name("Kisan");
        student1.setStudentAddress(studentAddress);
        Student student2 = new Student();
        student2.setStudent_name("Radha");
        student2.setStudentAddress(studentAddress);
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(student1);
        session.save(student2);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
