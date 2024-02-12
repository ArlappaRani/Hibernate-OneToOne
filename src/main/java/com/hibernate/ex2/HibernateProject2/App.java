package com.hibernate.ex2.HibernateProject2;

import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class App 
{
    public static void main( String[] args )
    {
    	
    	Bike bk1=new Bike();
    	Bike bk2=new Bike();
    	Bike bk3=new Bike();
    	 //creating object of student2 , bike
        Student2 st1=new Student2(11,"Ajay",24,bk1);
        Student2 st2=new Student2(12,"Amit",25,bk2);
        Student2 st3=new Student2(13,"Anuj",23,bk3);
        
        //creating object of bike
        
        bk1.setBikeID(1);
        bk1.setBrand("Hero");
        bk1.setColor("Black");
        bk1.setSt(st1);
        bk2.setBikeID(2);
        bk2.setBrand("KTM");
        bk2.setColor("Red");
        bk2.setSt(st2);
        bk3.setBikeID(3);
        bk3.setBrand("Honda");
        bk3.setColor("blue");
        bk3.setSt(st3);
        
        Configuration cfg =new Configuration().configure();
        SessionFactory factory=cfg.buildSessionFactory();
        
        //open session 
        Session session = factory.openSession();
        //get transaction
        Transaction trans = session.beginTransaction();
        
        //save
        session.save(st1);
        session.save(st2);
        session.save(st3);
        
        session.save(bk1);
        session.save(bk2);
        session.save(bk3);
        //using transaction we have to commit the changes
        trans.commit();
        System.out.println("Student and bike objects are saved");
        
        }
}
