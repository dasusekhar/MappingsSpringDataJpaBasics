package com.example.aop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.entity.Cus;
import com.example.aop.entity.Order;
import com.example.aop.service.CustomerService;

@RestController
@RequestMapping("/clinet")
public class MyController {
	@Autowired
	private CustomerService customerService;
	@PostMapping("/save")
	public ResponseEntity<String> saveToAll(@RequestBody Cus cus)
	{
		customerService.saveToAll(cus);
		return new ResponseEntity<String>("sucessfully saved the details",HttpStatus.ACCEPTED);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<?>> getAllDetails()
	{
		List<Cus> get=customerService.getAll();
		return new ResponseEntity<>(get,HttpStatus.ACCEPTED);
	}
	@PostMapping("/place")
	public ResponseEntity<String> saveToOrder(@RequestBody Order order)
	{
		customerService.placeOrder(order);
		return new ResponseEntity<String>("succesfully placed order",HttpStatus.ACCEPTED);
	}

}
