package com.project.onlinefooddelivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinefooddelivery.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
