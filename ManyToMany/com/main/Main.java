/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.model.Student;
import com.model.StudentCertification;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author harsh vaghani
 */
public class Main {

    public static void main(String[] args) {
        StudentCertification studentCertification1 = new StudentCertification();
        studentCertification1.setCertification_name("Red Hat Certification");
        StudentCertification studentCertification2 = new StudentCertification();
        studentCertification2.setCertification_name("Java Certification");
        StudentCertification studentCertification3 = new StudentCertification();
        studentCertification3.setCertification_name("Oracle Database Certification");
        Student student1 = new Student();
        student1.setStudent_name("Harsh");
        (student1.getStudentCertification()).add(studentCertification2);
        (student1.getStudentCertification()).add(studentCertification3);
        Student student2 = new Student();
        student2.setStudent_name("Dhruvil");
        (student2.getStudentCertification()).add(studentCertification1);
        Student student3 = new Student();
        student3.setStudent_name("Mihir");
        (student3.getStudentCertification()).add(studentCertification3);
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
