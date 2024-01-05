package com.hibernate.hiberProject1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tr = session.beginTransaction();
        Stude st = new Stude(11, "kitt", 67);
        Stude st1 = new Stude(11, "kitt", 6);
        Stude st5 = new Stude(11, "kitt", 6);
        Stude st4 = new Stude(11, "kitt", 57);
        session.save(st);
        tr.commit();
        
        System.out.println("Hibernate is working");
        }
}
