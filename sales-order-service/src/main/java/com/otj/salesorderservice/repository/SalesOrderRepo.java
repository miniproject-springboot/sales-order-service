package com.otj.salesorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otj.salesorderservice.model.SalesOrder;

public interface SalesOrderRepo extends JpaRepository<SalesOrder, Long> {

}
