package com.project.onlinefooddelivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinefooddelivery.entity.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item,Integer> {
	

}
