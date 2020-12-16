package com.tsconsult.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tsconsult.test.entity.Salarie;

public interface SalarieRepository extends MongoRepository<Salarie, String> {

}
