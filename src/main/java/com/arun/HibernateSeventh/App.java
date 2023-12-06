package com.arun.HibernateSeventh;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arun.entity.Department;
import com.arun.entity.Employee1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        
        Employee1 emp1=new Employee1("Rohan",34557.6f,"HR");
        
        Employee1 emp2=new Employee1("Arun",3457.6f,"OPS");
        
        Employee1 emp3=new Employee1("Sai",557.6f,"IT");
        
        Employee1 emp4=new Employee1("rakesh",34557.6f,"DEV");
        
        Set<Employee1> set=new HashSet<>();
        
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        set.add(emp4);
        
        Department dep=new Department();
        
        dep.setDeptId("T125");
        dep.setDeptName("Ed-Tech");
        dep.setEmployee(set);
        
        session.save(dep);
        
        tx.commit();
        
        session.close();
            
        
    }
}
