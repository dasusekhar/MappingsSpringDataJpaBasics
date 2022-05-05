package com.example.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aop.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{

}
