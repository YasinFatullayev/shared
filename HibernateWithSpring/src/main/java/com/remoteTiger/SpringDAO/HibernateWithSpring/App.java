package com.remoteTiger.SpringDAO.HibernateWithSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.orm.hibernate4.annotation.AnnotationSessionFactoryBean;

import com.remoteTiger.SpringDAO.HibernateWithSpring.ServiceLayer;

public class App 
{
    public static void main( String[] args )
    {
        // FINALLY MADE AT 5:15 AM 
    	 //CoffeeDAO coffeeDAO = (CoffeeDAO)context.getBean(CoffeeDAO.class);
		//ServiceLayer sl=new ServiceLayer();
    	ClassPathXmlApplicationContext context = new 
    			ClassPathXmlApplicationContext("Spring.xml");
    	
    	ServiceLayer sl=(ServiceLayer)context.getBean("service");
		sl.add();
		//sl.delete(33);			//DELETE FROM DATABASE BY ID
		
		
		//IF YOU WANT TO CLEAR ALL YOUR DATABASE USE THE FOLLOWING FOR LOOP
//		int a;
//		for(a=0;a<25;a++){
//		
//		
//		if (sl.delete(a)){
//			
//			continue;
//			
//		}
//		
//		
//		}
    	
    	
    	
    
    	
    	
    	
    }
}
