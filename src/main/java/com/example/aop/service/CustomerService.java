package com.example.aop.service;

import java.util.List;

import com.example.aop.entity.Cus;
import com.example.aop.entity.Order;

public interface CustomerService {

	void saveToAll(Cus cus);

	List<Cus> getAll();

	void placeOrder(Order order);

}
