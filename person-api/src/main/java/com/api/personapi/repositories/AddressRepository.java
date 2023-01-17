package com.api.personapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.personapi.models.AddressModel;

@Repository
public interface AddressRepository extends JpaRepository<AddressModel, Integer>{}
