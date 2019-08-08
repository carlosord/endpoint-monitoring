package com.example.endpoint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.endpoint.model.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {

	List<Data> findByEndpoint(String endpoint);
}
