/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author harsh vaghani
 */
public class Main {
     public static void main(String[] args) {
       
        Student st = new Student(2, "Harsh", "harsh@gmail.com", 9913608014L, "Ashokvatika,Surat");

        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
