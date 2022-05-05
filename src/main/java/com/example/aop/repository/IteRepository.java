package com.example.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aop.entity.Ite;

@Repository
public interface IteRepository extends JpaRepository<Ite,Integer>{

}
