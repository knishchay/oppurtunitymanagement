package com.sampleapproach.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sampleapproach.dao.CustomerDaoImpl;
import com.sampleapproach.model.Customer;

@RestController
@RequestMapping ("/dxc")
public class CutomerController {
	
	
	
	  @Autowired CustomerDaoImpl customerdao;
	 
	 
	
	
//	  @RequestMapping(value= {"/customers"},method=RequestMethod.POST) 
//	  public void createCustomer() {
//	  //customerdao.insert(cus); System.out.println("test"); 
//		  }
	 
	
	
	  @RequestMapping(value={"/customers"},method=RequestMethod.GET) public
	  List<Customer> getCustomer(HttpServletRequest req, HttpServletResponse res) {
		  System.out.println("xjjaj"); return
	  customerdao.loadAllCustomer();
	  
	  }
	 
	 
	  @RequestMapping("/test") 
	  public String test(HttpServletRequest req, HttpServletResponse res) { 
		  return "test";
	  
	  }
}
