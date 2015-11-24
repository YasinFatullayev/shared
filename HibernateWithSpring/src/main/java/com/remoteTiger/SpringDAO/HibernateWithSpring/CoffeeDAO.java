package com.remoteTiger.SpringDAO.HibernateWithSpring;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.AnnotationConfiguration;
import com.remoteTiger.SpringDAO.HibernateWithSpring.Coffee;
//import java.util.logging.*;


 
import org.hibernate.Session; 


public class CoffeeDAO {

		private SessionFactory sessionfactory;
	
	 
	   public void setSessionfactory(SessionFactory sessionfactory) {
			this.sessionfactory = sessionfactory;
		}



	   


	   public Integer addEmployee(String fname, String country, int quantity,int productNo){
		   
		   System.out.println("ADD EMPLOYEE()------------------------------");
//		   Logger a=Logger.getLogger("before execution of the FactoryDAO");
//	    	  a.getClass();
//		   
//		   Session session = factory.openSession();
		   
		   Session session=this.sessionfactory.openSession();  
		   
		   Transaction tx = null;
		      Integer CoffeeID = null;
		      try{
		         tx = session.beginTransaction();
		         Coffee cofe = new Coffee();
		         cofe.setName(fname);
		         cofe.setCountry(country);
		         cofe.setQuantity(quantity);
		         cofe.setPRODUCT_NO(productNo);
		         CoffeeID = (Integer) session.save(cofe); 
		         tx.commit();
		         
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
		      return CoffeeID;
		   }
	   
	   
	   
	   
	   
	   
	   public boolean del(int id){
		   
   System.out.println("delete coffee()------------------------------");
		   boolean valid=false;
		   
             Session session=this.sessionfactory.openSession(); 
		      Transaction tx = null;
		      Integer CoffeeID = null;
		      try{
		         tx = session.beginTransaction();
		         Coffee cofe = new Coffee();
		         cofe.setId(id);
		         session.delete(cofe);
		         tx.commit();
		         valid=true;
		         
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
		      return valid;

		   }
	  

}
