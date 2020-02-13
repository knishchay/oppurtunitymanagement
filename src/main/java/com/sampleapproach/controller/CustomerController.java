package com.sampleapproach.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sampleapproach.dao.CustomerDaoImpl;
import com.sampleapproach.model.Customer;

@RestController
@RequestMapping("/dxc")
public class CustomerController {

	@Autowired
	CustomerDaoImpl customerdao;

	@RequestMapping(value = { "/customers" }, method = RequestMethod.POST)
	public void createCustomer(@RequestBody Customer cus) {
		customerdao.insert(cus);
	}

	@RequestMapping(value = { "/customers" }, method = RequestMethod.GET)
	public List<Customer> getCustomer(HttpServletRequest req, HttpServletResponse res) {
		return customerdao.loadAllCustomer();

	}

	@RequestMapping(value = {"/customers/{id}"}, method = RequestMethod.GET)
	public @ResponseBody Customer getCustomerbyId(@PathVariable int cust_id) {
		return customerdao.findCustomerById(cust_id);

	}
}
