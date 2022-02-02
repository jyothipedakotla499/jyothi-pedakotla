package com.project.onlinefooddelivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinefooddelivery.entity.Bill;

@Repository
public interface BillRepo extends JpaRepository<Bill,Integer>  {

}
