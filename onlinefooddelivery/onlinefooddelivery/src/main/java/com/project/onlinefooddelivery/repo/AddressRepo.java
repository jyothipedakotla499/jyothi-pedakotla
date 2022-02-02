package com.project.onlinefooddelivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinefooddelivery.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {

}

