package com.example.aop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aop.entity.Cus;
import com.example.aop.entity.Order;
import com.example.aop.repository.CartRepository;
import com.example.aop.repository.CusRepository;
import com.example.aop.repository.IteRepository;
import com.example.aop.repository.OrderRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CusRepository cusRepository;
	@Autowired
	private IteRepository iteRepository;
	@Autowired
	private CartRepository cartRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Override
	public void saveToAll(Cus cus) {
	   cusRepository.save(cus);
		
	}
	@Override
	public List<Cus> getAll() {
		
		return cusRepository.findAll();
	}
	@Override
	public void placeOrder(Order order) {
	   orderRepository.save(order);
		
	}
	
	
	

}
