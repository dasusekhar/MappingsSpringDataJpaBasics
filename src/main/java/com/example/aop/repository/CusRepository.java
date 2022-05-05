package com.example.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aop.entity.Cus;

@Repository
public interface CusRepository extends JpaRepository<Cus,Integer> {

}
