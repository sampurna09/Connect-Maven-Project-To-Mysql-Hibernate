package com.maven.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student ss =new Student();
        ss.setId(3);
        ss.setName("Student3");
        ss.setAdddress("Address3");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ss);
        ss =(Student) session.get(Student.class, 3);
        tx.commit();
        System.out.println(ss);
        
        
        
    }
}
