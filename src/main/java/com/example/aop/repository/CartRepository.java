package com.example.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aop.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer>{
	

}
