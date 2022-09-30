package com.harbinger.jpa.repository;

import com.harbinger.jpa.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
