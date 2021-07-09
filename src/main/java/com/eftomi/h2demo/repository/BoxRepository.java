package com.eftomi.h2demo.repository;

import com.eftomi.h2demo.model.Box;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoxRepository extends CrudRepository<Box, Integer> {
}
