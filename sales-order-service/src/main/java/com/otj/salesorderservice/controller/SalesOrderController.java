package com.otj.salesorderservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.otj.salesorderservice.model.CustomerSOS;
import com.otj.salesorderservice.model.OrderLineItem;
import com.otj.salesorderservice.model.SalesOrder;
import com.otj.salesorderservice.repository.CustomerSOSRepo;

@RestController
public class SalesOrderController {
	
	@Autowired
	private CustomerSOSRepo customersosrepo;

	@PostMapping("service3/orders")
	public void createOrder(@RequestBody SalesOrder salesOrder) {
		
		Optional<CustomerSOS> customer = customersosrepo.findById(salesOrder.getCust_id());
		//verify customer
		if(customer.isPresent()) {
			
			List<OrderLineItem> item=salesOrder.getOrderLineItem();
			for(int i=0;i<item.size();i++) {
				
				
				//new RestTemplate().getForEntity("http://localhsot:8001/service2/items/{itemname}", responseType);
				
				
			}
			
		}
		//validate items by calling item service
		//create order
		
		
	}
}
