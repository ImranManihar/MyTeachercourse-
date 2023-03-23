package com.pro.TeacherCourseOnetoMany;

import java.util.ArrayList;
import java.util.List;

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
    	Configuration conf=new Configuration().configure().addAnnotatedClass(Teacher.class);
    	Configuration conf1=new Configuration().configure().addAnnotatedClass(Teacher.class);
    	SessionFactory sf=conf.buildSessionFactory();
    	Session ss=sf.openSession();
    	
		Transaction t= ss.beginTransaction();
		Teacher tc=new Teacher();
		tc.setId(101);
		tc.setName("Mrunali");
		
		Course c=new Course();
		c.setCourseid(155);
		c.setCoursename("Java");
		
		
		Course c1=new Course();
		c1.setCourseid(156);
		c1.setCoursename("Python");
		
		Course c2=new Course();
		c2.setCourseid(157);
		c2.setCoursename("Angular");
		
		List<Course> I1=new ArrayList<Course>();
        I1.add(c);
        I1.add(c1);
        I1.add(c2);
        tc.setItems(I1);
        ss.persist(tc);
        t.commit();
        ss.close();
		
    	
    	
        System.out.println( "Hello World!" );
    }
}
