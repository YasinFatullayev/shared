package com.remoteTiger.SpringDAO.HibernateWithSpring;

public class ServiceLayer {
	
	private CoffeeDAO a;
	
	private String fname;
	public void setFname(String fname) {
		this.fname = fname;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}






	private String country;
	private int quantity;
	private int productNo;
	
	
	
	
	
	

	public void setA(CoffeeDAO a) {
		this.a = a;
	}



	public void add()
	
	
	{	
		
		
		//CoffeeDAO.Connect();
		
		 a.addEmployee(this.fname, this.country, this.quantity, this.productNo);	
		
	}
	
	
	



	public boolean delete(int id){
		boolean valid=false;
		
		//CoffeeDAO.Connect();
	if(	a.del(id)){
		
		
		if (valid=true){System.out.println("-----------=======DELETED=======---------------");}
		return valid=true;
		
		
	}		
		
	
	
	
	return valid;
	}
	
	
	
	

}
