package com.sampleapproach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleapproach.dao.CustomerDaoImpl;
import com.sampleapproach.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	 @Autowired 
	 CustomerDaoImpl customerDao;
	  
	  @Override
	  public void insert(Customer cus) {
	    customerDao.insert(cus);
	  }
	  
	  @Override
	  public void insertBatch(List<Customer> customers) {
	    customerDao.inserBatch(customers);
	  }  
	  
	  public void loadAllCustomer(){
	    List<Customer> listCust = customerDao.loadAllCustomer();
	    for(Customer cus: listCust){
	      System.out.println(cus.toString());
	    }
	  }
	 
	  @Override
	  public void getCustomerById(long cust_id) {
	    Customer cust = customerDao.findCustomerById(cust_id);
	    System.out.println(cust);
	  }
	 
	  @Override
	  public void getCustomerNameById(long cust_id) {
	    String name = customerDao.findNameById(cust_id);
	    System.out.println("Customer's name = " + name);
	  }
	 
	  @Override
	  public void getTotalNumerCustomer() {
	    int totalNumberCustomer = customerDao.getTotalNumberCustomer();
	    System.out.println("Total Number Customer is: " + totalNumberCustomer);
	  }
	 
}
