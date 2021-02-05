/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.model.Student;
import com.model.StudentDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author harsh vaghani
 */
public class Main {

    public static void main(String[] args) {
        Student student = new Student();

        student.setStudent_name("Harsh Vaghani");

        StudentDetails studentDetails = new StudentDetails();

        studentDetails.setStudent_address("D D University");

        studentDetails.setStudent(student);

        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(studentDetails);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
