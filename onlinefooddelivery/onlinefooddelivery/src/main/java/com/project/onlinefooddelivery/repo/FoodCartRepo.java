package com.project.onlinefooddelivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinefooddelivery.entity.FoodCart;

@Repository
public interface FoodCartRepo extends  JpaRepository<FoodCart,Integer>{

}
