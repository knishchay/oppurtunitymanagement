package com.sampleapproach;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sampleapproach.model.Customer;
import com.sampleapproach.service.CustomerService;

@SpringBootApplication
public class OpputunityManagementSpringJdbcPostgreSqlApplication implements CommandLineRunner{

	@Autowired
	CustomerService cusService;

	public static void main(String[] args) {
		SpringApplication.run(OpputunityManagementSpringJdbcPostgreSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Random r = new Random();
		 
		 // Customer 1
		 Customer cus_1 = new Customer();
		 cus_1.setName("demoCustomer_1");
		 cus_1.setAge(30);
		 
		 // Customer 2
		 Customer cus_2 = new Customer();
		 cus_2.setName("demoCustomer_2");
		 cus_2.setAge(30);
		 
		 // Customer 3
		 Customer cus_3 = new Customer();
		 cus_3.setName("demoCustomer_2");
		 cus_3.setAge(30);
		 
//		 Insert a customer
//		 cusService.insert(cus_3);
//		 Insert a List of Customer
		 //List<Customer> customers = new ArrayList<Customer>();
		 //customers.add(cus_2);
		// customers.add(cus_3);
		 //cusService.insertBatch(customers); 
//		 Load All Customer
//		 cusService.loadAllCustomer();
//		 Get Customer By Id
		 //cusService.getCustomerById(Long.valueOf(cus_1_id));
//		 Get Customer’s name by Id
		// cusService.getCustomerNameById(1);
//		 Get Total Customers in DB
		 //cusService.getTotalNumerCustomer();

		 

		 
	}

}
