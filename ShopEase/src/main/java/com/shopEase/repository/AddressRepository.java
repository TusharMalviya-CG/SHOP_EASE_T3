package com.shopEase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopEase.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
