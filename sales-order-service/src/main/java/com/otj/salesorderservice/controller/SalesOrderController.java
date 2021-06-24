package com.otj.salesorderservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.otj.salesorderservice.model.SalesOrder;

@RestController
public class SalesOrderController {

	@PostMapping("service3/orders")
	public void createOrder(@RequestBody SalesOrder salesOrder) {
		
		
	}
}
