package com.otj.salesorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otj.salesorderservice.model.OrderLineItem;

public interface OrderLineItemRepo extends JpaRepository<OrderLineItem, Long>{

}
