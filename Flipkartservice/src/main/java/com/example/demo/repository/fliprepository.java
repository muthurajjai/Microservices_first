package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Flipproduct;

@Repository
public interface fliprepository extends JpaRepository<Flipproduct, Integer> {

}
