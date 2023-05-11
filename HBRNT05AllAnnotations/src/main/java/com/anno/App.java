package com.anno;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main(String[] args ) throws IOException
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        Address ad=new Address();
       // ad.setAddressId(100);
        ad.setStreet("street4");
        ad.setCity("pune");
        ad.setAddedDate(new Date());
        ad.setX(14.10);
        
        
        FileInputStream fis=new FileInputStream("src/main/java/error_404.jpg");
        byte[] data=new	byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        System.out.println(ad);
        
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(ad);
        tx.commit();
        session.close();
        factory.close();
    }
}
